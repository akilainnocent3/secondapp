package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ofy implements xgz {
    public static final a b = a.a;
    public final mfy a;

    public static final class a extends qlr implements Function1<ofy, Unit> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ofy ofyVar) {
            ofy ofyVar2 = ofyVar;
            if (ofyVar2.Z0()) {
                ofyVar2.a.t0();
            }
            return Unit.a;
        }
    }

    public ofy(mfy mfyVar) {
        this.a = mfyVar;
    }

    @Override // defpackage.xgz
    public final boolean Z0() {
        return this.a.i().C;
    }
}
