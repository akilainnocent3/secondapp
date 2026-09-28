package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fbg_dialog.presentation.component.ComposeFBGDialogKt$AutoSizeBasicTextField$2$1", f = "ComposeFBGDialog.kt", l = {}, m = "invokeSuspend", v = 1)
public final class kca extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ olf0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ imf0 e;
    public final /* synthetic */ ytw<Integer> f;
    public final /* synthetic */ ytw<omf0> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kca(long j, long j2, olf0 olf0Var, String str, imf0 imf0Var, ytw<Integer> ytwVar, ytw<omf0> ytwVar2, v1b<? super kca> v1bVar) {
        super(2, v1bVar);
        this.a = j;
        this.b = j2;
        this.c = olf0Var;
        this.d = str;
        this.e = imf0Var;
        this.f = ytwVar;
        this.i = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kca(this.a, this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kca) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Integer value = this.f.getValue();
        if (value == null) {
            return Unit.a;
        }
        int iIntValue = value.intValue();
        float fC = omf0.c(this.a);
        float fC2 = omf0.c(this.b);
        float f = fC;
        while (fC <= fC2) {
            float f2 = (fC + fC2) / 2.0f;
            if (((int) (olf0.a(this.c, this.d, imf0.b(this.e, 0L, d2l.g(f2, 4294967296L), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), 0L, 1004).c >> 32)) <= iIntValue) {
                fC = f2 + 0.5f;
                f = f2;
            } else {
                fC2 = f2 - 0.5f;
            }
        }
        long jG = d2l.g(f, 4294967296L);
        ytw<omf0> ytwVar = this.i;
        if (!omf0.a(jG, ytwVar.getValue().a)) {
            ytwVar.setValue(new omf0(jG));
        }
        return Unit.a;
    }
}
