package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {554}, m = "invokeSuspend")
public final class xga extends ji50 implements Function2<wc80<? super String>, v1b<? super Unit>, Object> {
    public int b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yga i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xga(yga ygaVar, v1b<? super xga> v1bVar) {
        super(2, v1bVar);
        this.i = ygaVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xga xgaVar = new xga(this.i, v1bVar);
        xgaVar.f = obj;
        return xgaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wc80<? super String> wc80Var, v1b<? super Unit> v1bVar) {
        return ((xga) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wc80 wc80Var;
        int i;
        int i2;
        int i3;
        String strA;
        int i4;
        int i5;
        String str;
        yga ygaVar = this.i;
        ccy<Object> ccyVar = ygaVar.a;
        lsw lswVar = ygaVar.c;
        y5b y5bVar = y5b.a;
        int i6 = this.e;
        if (i6 == 0) {
            uj50.b(obj);
            wc80Var = (wc80) this.f;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.d;
            i2 = this.c;
            i3 = this.b;
            wc80Var = (wc80) this.f;
            uj50.b(obj);
        }
        if (i3 >= Math.min(ygaVar.d, lswVar.b)) {
            return Unit.a;
        }
        int i7 = i3 + 1;
        int iC = lswVar.c(i3);
        switch (iC) {
            case 0:
                strA = "up";
                break;
            case 1:
                String strA2 = wga.a(ccyVar.b(i2), "down ");
                i2++;
                strA = strA2;
                break;
            case 2:
                strA = "remove " + lswVar.c(i7) + ' ' + lswVar.c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strA = "move " + lswVar.c(i7) + ' ' + lswVar.c(i3 + 2) + ' ' + lswVar.c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strA = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC2 = lswVar.c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC2 + ' ' + ccyVar.b(i2);
                int i8 = i4;
                strA = str;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC3 = lswVar.c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iC3 + ' ' + ccyVar.b(i2);
                int i9 = i4;
                strA = str;
                i7 = i9;
                i2 = i5;
                break;
            case 7:
                int i10 = i2 + 1;
                Object objB = ccyVar.b(i2);
                objB.getClass();
                y8h0.d(2, objB);
                i2 += 2;
                strA = "apply " + ((Function2) objB) + ' ' + ccyVar.b(i10);
                break;
            case 8:
                strA = "reuse " + ygaVar.b.b(i);
                i++;
                break;
            default:
                strA = hce0.a(iC, "unknown op: ");
                break;
        }
        String strA3 = vga.a(i3, ": ", strA);
        this.f = wc80Var;
        this.b = i7;
        this.c = i2;
        this.d = i;
        this.e = 1;
        wc80Var.b(this, strA3);
        return y5bVar;
    }
}
