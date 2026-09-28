package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zk5 implements uih {
    public final ByteBuffer a;
    public final u2z b;

    public static final class a implements uih.a<ByteBuffer> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            return new zk5((ByteBuffer) obj, u2zVar);
        }
    }

    public zk5(ByteBuffer byteBuffer, u2z u2zVar) {
        this.a = byteBuffer;
        this.b = u2zVar;
    }

    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) {
        ByteBuffer byteBuffer = this.a;
        return new aqa0(new dqa0(new y740(new al5(byteBuffer)), this.b.f, new dl5(byteBuffer)), null, bqc.b);
    }
}
