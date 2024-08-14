package net.rsprox.protocol.game.outgoing.decoder.codec.interfaces

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.util.gCombinedIdAlt1
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.decoder.prot.GameServerProt
import net.rsprox.protocol.game.outgoing.model.interfaces.IfClearInv
import net.rsprox.protocol.session.Session

public class IfClearInvDecoder : ProxyMessageDecoder<IfClearInv> {
    override val prot: ClientProt = GameServerProt.IF_CLEARINV

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): IfClearInv {
        val combinedId = buffer.gCombinedIdAlt1()
        return IfClearInv(
            combinedId.interfaceId,
            combinedId.componentId,
        )
    }
}
