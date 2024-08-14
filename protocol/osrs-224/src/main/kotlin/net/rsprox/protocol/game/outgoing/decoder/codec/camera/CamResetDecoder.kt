package net.rsprox.protocol.game.outgoing.decoder.codec.camera

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.metadata.Consistent
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.decoder.prot.GameServerProt
import net.rsprox.protocol.game.outgoing.model.camera.CamReset
import net.rsprox.protocol.session.Session

@Consistent
public class CamResetDecoder : ProxyMessageDecoder<CamReset> {
    override val prot: ClientProt = GameServerProt.CAM_RESET

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): CamReset {
        return CamReset
    }
}
