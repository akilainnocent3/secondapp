package defpackage;

import androidx.compose.runtime.k;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class zp70 implements fr70 {
    public static final uv60 i = new uv60(new xp70(), new wp70());
    public final osw a;
    public float e;
    public final osw b = k.a(0);
    public final qsw c = new qsw();
    public final osw d = k.a(Reader.READ_DONE);
    public final sfd f = new sfd(new Function1() { // from class: up70
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            float fFloatValue = ((Float) obj).floatValue();
            zp70 zp70Var = this.a;
            osw oswVar = zp70Var.a;
            u5a0 u5a0Var = (u5a0) oswVar;
            float fD = u5a0Var.D() + fFloatValue + zp70Var.e;
            float fD2 = f.d(fD, 0.0f, zp70Var.h());
            boolean z = fD == fD2;
            float fD3 = fD2 - u5a0Var.D();
            int iRound = Math.round(fD3);
            ((u5a0) oswVar).k(u5a0Var.D() + iRound);
            zp70Var.e = fD3 - iRound;
            if (!z) {
                fFloatValue = fD3;
            }
            return Float.valueOf(fFloatValue);
        }
    });
    public final mae g = a6a0.b(new kbq(this, 2));
    public final mae h = a6a0.b(new vp70(this, 0));

    public zp70(int i2) {
        this.a = k.a(i2);
    }

    @Override // defpackage.fr70
    public final float a(float f) {
        return this.f.a(f);
    }

    @Override // defpackage.fr70
    public final Object b(huw huwVar, Function2<? super tp70, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super Unit> v1bVar) {
        Object objB = this.f.b(huwVar, function2, v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    @Override // defpackage.fr70
    public final boolean c() {
        return this.f.c();
    }

    @Override // defpackage.fr70
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.fr70
    public final boolean e() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final Object f(int i2, xi0 xi0Var, tje0 tje0Var) {
        Object objA = ts7.a(this, i2 - ((u5a0) this.a).D(), xi0Var, tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    public final int h() {
        return ((u5a0) this.d).D();
    }
}
