package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class cv1 implements lyh<jv1> {
    public final /* synthetic */ h1i a;
    public final /* synthetic */ zr40 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: cv1$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.refscall.presentation.ui.mapper.BalanceMapper$toBalanceUIState$$inlined$map$1$2", f = "BalanceMapper.kt", l = {50}, m = "emit", v = 1)
        public static final class C0464a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0464a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, zr40 zr40Var) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0464a c0464a;
            String strK1;
            if (v1bVar instanceof C0464a) {
                c0464a = (C0464a) v1bVar;
                int i = c0464a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0464a.b = i - Integer.MIN_VALUE;
                } else {
                    c0464a = new C0464a(v1bVar);
                }
            } else {
                c0464a = new C0464a(v1bVar);
            }
            Object obj2 = c0464a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0464a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                av1.a aVar = (av1.a) obj;
                BigDecimal bigDecimal = aVar.c;
                boolean z = false;
                if (bigDecimal != null && bigDecimal.compareTo(skd0.b) <= 0) {
                    z = true;
                }
                boolean z2 = !z;
                String str = !z ? "+" : "-";
                BigDecimal bigDecimal2 = aVar.c;
                if (bigDecimal2 != null) {
                    BigDecimal bigDecimalAbs = bigDecimal2.abs();
                    bigDecimalAbs.getClass();
                    BigDecimal bigDecimal3 = skd0.b;
                    strK1 = av1.k1(bigDecimalAbs);
                } else {
                    strK1 = "";
                }
                String str2 = aVar.a;
                BigDecimal bigDecimal4 = aVar.b;
                if (bigDecimal4 == null) {
                    bigDecimal4 = skd0.b;
                }
                jv1 jv1Var = new jv1(str2, av1.k1(bigDecimal4), str + ' ' + strK1, z2);
                c0464a.b = 1;
                if (this.a.emit(jv1Var, c0464a) == y5bVar) {
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

    public cv1(h1i h1iVar, zr40 zr40Var) {
        this.a = h1iVar;
        this.b = zr40Var;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super jv1> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
