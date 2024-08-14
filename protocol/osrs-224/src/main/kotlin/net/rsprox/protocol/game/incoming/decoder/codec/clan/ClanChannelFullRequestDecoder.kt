package net.rsprox.protocol.game.incoming.decoder.codec.clan

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.metadata.Consistent
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.incoming.decoder.prot.GameClientProt
import net.rsprox.protocol.game.incoming.model.clan.ClanChannelFullRequest
import net.rsprox.protocol.session.Session

@Consistent
public class ClanChannelFullRequestDecoder : ProxyMessageDecoder<ClanChannelFullRequest> {
    override val prot: ClientProt = GameClientProt.CLANCHANNEL_FULL_REQUEST

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): ClanChannelFullRequest {
        val clanId = buffer.g1s()
        return ClanChannelFullRequest(clanId)
    }
}
