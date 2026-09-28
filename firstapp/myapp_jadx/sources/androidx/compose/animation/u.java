package androidx.compose.animation;

import defpackage.asr;
import defpackage.bxz;
import defpackage.d0b;
import defpackage.e490;
import defpackage.f490;
import defpackage.fkd0;
import defpackage.g490;
import defpackage.hb5;
import defpackage.ht;
import defpackage.lk40;
import defpackage.m490;
import defpackage.mmd;
import defpackage.mni0;
import defpackage.n490;
import defpackage.op8;
import defpackage.pp8;
import defpackage.rtw;
import defpackage.x5a0;
import defpackage.yi0;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final fkd0<lk40> a = yi0.d(0.0f, 400.0f, mni0.a, 1);
    public static final a b = new a();
    public static final e490 c = new e490();
    public static final rtw<d0b, rtw<ht, i>> d = new rtw<>((Object) null);

    public static final class a implements l.a {
        @Override // androidx.compose.animation.l.a
        public final bxz a(l.d dVar, lk40 lk40Var, asr asrVar, mmd mmdVar) {
            k kVar = (k) ((x5a0) dVar.b).getValue();
            if (kVar == null) {
                hb5.a("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
                return null;
            }
            k kVar2 = kVar.y;
            l.d dVar2 = kVar2 != null ? (l.d) ((x5a0) kVar2.v).getValue() : null;
            if (dVar2 != null) {
                k kVar3 = (k) ((x5a0) dVar2.b).getValue();
                if (kVar3 != null) {
                    return kVar3.w;
                }
                hb5.a("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
            }
            return null;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, op8 op8Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(646379026);
        if (bVarI.q(i & 1, (i & 19) != 18)) {
            b(6, pp8.b(1948801580, new f490(dVar, op8Var), bVarI), bVarI);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new g490(dVar, op8Var, i);
        }
    }

    public static final void b(int i, op8 op8Var, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1908320054);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            androidx.compose.ui.layout.s.a(6, pp8.b(2062852661, new m490(op8Var), bVarI), bVarI);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new n490(i, op8Var);
        }
    }
}
