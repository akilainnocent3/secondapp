package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class dv1 implements lyh<jv1> {
    public final /* synthetic */ h1i a;
    public final /* synthetic */ gux b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: dv1$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.nightnday.presentation.mapper.BalanceMapper$toBalanceUIState$$inlined$map$1$2", f = "BalanceMapper.kt", l = {50}, m = "emit", v = 1)
        public static final class C0506a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0506a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, gux guxVar) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0506a c0506a;
            String str;
            if (v1bVar instanceof C0506a) {
                c0506a = (C0506a) v1bVar;
                int i = c0506a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0506a.b = i - Integer.MIN_VALUE;
                } else {
                    c0506a = new C0506a(v1bVar);
                }
            } else {
                c0506a = new C0506a(v1bVar);
            }
            Object obj2 = c0506a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0506a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                bv1 bv1Var = (bv1) obj;
                Double d = bv1Var.c;
                boolean z = false;
                if (d != null && d.doubleValue() <= 0.0d) {
                    z = true;
                }
                boolean z2 = !z;
                String str2 = !z ? "+" : "-";
                Double d2 = bv1Var.c;
                if (d2 != null) {
                    double dAbs = Math.abs(d2.doubleValue());
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.ENGLISH));
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                    str = decimalFormat.format(dAbs);
                    str.getClass();
                } else {
                    str = "";
                }
                String str3 = bv1Var.a;
                Double d3 = bv1Var.b;
                double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
                DecimalFormat decimalFormat2 = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.ENGLISH));
                decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                String str4 = decimalFormat2.format(dDoubleValue);
                str4.getClass();
                jv1 jv1Var = new jv1(str3, str4, str2 + ' ' + str, z2);
                c0506a.b = 1;
                if (this.a.emit(jv1Var, c0506a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public dv1(h1i h1iVar, gux guxVar) {
        this.a = h1iVar;
        this.b = guxVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super jv1> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
