package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {88}, m = "invokeSuspend")
public final class yja extends tje0 implements Function2<Float, v1b<? super Float>, Object> {
    public boolean a;
    public int b;
    public /* synthetic */ float c;
    public final /* synthetic */ vja d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yja(vja vjaVar, v1b<? super yja> v1bVar) {
        super(2, v1bVar);
        this.d = vjaVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yja yjaVar = new yja(this.d, v1bVar);
        yjaVar.c = ((Number) obj).floatValue();
        return yjaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, v1b<? super Float> v1bVar) {
        return ((yja) create(Float.valueOf(f.floatValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            float f = this.c;
            vja vjaVar = this.d;
            Function2 function2 = (Function2) ta80.a(vjaVar.a.d, ra80.e);
            if (function2 == null) {
                throw w20.a("Required value was null.");
            }
            boolean z2 = ((vo70) vjaVar.a.d.d(hb80.u)).c;
            if (z2) {
                f = -f;
            }
            gly glyVar = new gly((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.a = z2;
            this.b = 1;
            obj = function2.invoke(glyVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            z = z2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.a;
            uj50.b(obj);
        }
        long j = ((gly) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
