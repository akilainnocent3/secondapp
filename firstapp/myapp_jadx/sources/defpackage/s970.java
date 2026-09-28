package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
public final class s970 implements lyh<lmw> {
    public final /* synthetic */ k1i a;
    public final /* synthetic */ aa70 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMultipleBetHandlerImpl$init$$inlined$map$4", f = "ScheduledFootballMultipleBetHandlerImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return s970.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMultipleBetHandlerImpl$init$$inlined$map$4$2", f = "ScheduledFootballMultipleBetHandlerImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, aa70 aa70Var) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            int i;
            lmw lmwVar;
            lmw lmwVar2;
            int i2;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i3 = aVar.b;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    aVar.b = i3 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i4 = aVar.b;
            if (i4 == 0) {
                uj50.b(obj2);
                bxg0 bxg0Var = (bxg0) obj;
                x270 x270Var = (x270) bxg0Var.a;
                String str = (String) bxg0Var.b;
                mmw mmwVar = (mmw) bxg0Var.c;
                wr4 wr4Var = x270Var.e;
                BigDecimal bigDecimal = x270Var.d.c;
                mmwVar.getClass();
                str.getClass();
                wr4Var.getClass();
                long j = mmwVar.a;
                if (j <= 0) {
                    lmwVar2 = lmw.m;
                    i2 = 1;
                } else {
                    BigDecimal bigDecimal2 = mmwVar.b;
                    BigDecimal bigDecimal3 = mmwVar.c;
                    BigDecimal bigDecimal4 = mmwVar.d;
                    BigDecimal bigDecimal5 = mmwVar.e;
                    int i5 = mmwVar.f;
                    BigDecimal bigDecimalG = kotlin.text.b.g(str);
                    if (bigDecimalG == null) {
                        bigDecimalG = BigDecimal.ZERO;
                    }
                    BigDecimal bigDecimal6 = BigDecimal.ZERO;
                    if (bigDecimalG.compareTo(bigDecimal6) <= 0) {
                        lmw lmwVar3 = lmw.m;
                        BigDecimal bigDecimal7 = lmwVar3.d;
                        BigDecimal bigDecimal8 = lmwVar3.e;
                        BigDecimal bigDecimal9 = lmwVar3.f;
                        BigDecimal bigDecimal10 = lmwVar3.g;
                        BigDecimal bigDecimal11 = lmwVar3.h;
                        BigDecimal bigDecimal12 = lmwVar3.i;
                        BigDecimal bigDecimal13 = lmwVar3.j;
                        BigDecimal bigDecimal14 = lmwVar3.k;
                        float f = lmwVar3.l;
                        bigDecimal2.getClass();
                        bigDecimal3.getClass();
                        bigDecimal7.getClass();
                        bigDecimal8.getClass();
                        bigDecimal9.getClass();
                        bigDecimal10.getClass();
                        bigDecimal11.getClass();
                        bigDecimal12.getClass();
                        bigDecimal13.getClass();
                        bigDecimal14.getClass();
                        lmwVar = new lmw(j, bigDecimal2, bigDecimal3, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14, f);
                    } else {
                        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
                        bigDecimalValueOf.getClass();
                        BigDecimal bigDecimalMultiply = bigDecimalG.multiply(bigDecimalValueOf);
                        BigDecimal bigDecimalMultiply2 = bigDecimalG.multiply(bigDecimal2);
                        BigDecimal bigDecimalMultiply3 = bigDecimalG.multiply(bigDecimal3);
                        BigDecimal bigDecimalMultiply4 = bigDecimalG.multiply(bigDecimal4);
                        BigDecimal bigDecimalMultiply5 = bigDecimalG.multiply(bigDecimal5);
                        BigDecimal bigDecimal15 = (BigDecimal) f.b(bigDecimalMultiply2, bigDecimal);
                        BigDecimal bigDecimal16 = (BigDecimal) f.b(bigDecimalMultiply3, bigDecimal);
                        BigDecimal bigDecimal17 = (BigDecimal) f.b(bigDecimalMultiply4, bigDecimal);
                        BigDecimal bigDecimal18 = (BigDecimal) f.b(bigDecimalMultiply5, bigDecimal);
                        BigDecimal bigDecimal19 = bigDecimalG;
                        BigDecimal bigDecimal20 = (BigDecimal) f.b(bigDecimal15.add(bigDecimal17), bigDecimal);
                        BigDecimal bigDecimal21 = (BigDecimal) f.b(bigDecimal16.add(bigDecimal18), bigDecimal);
                        float f2 = 0.0f;
                        if (bigDecimal18.compareTo(bigDecimal6) > 0 && (wr4Var instanceof wr4.b) && (i = ((wr4.b) wr4Var).d) != 0) {
                            if (i5 > i) {
                                i5 = i;
                            }
                            f2 = i5 / i;
                        }
                        float f3 = f2;
                        bigDecimalMultiply.getClass();
                        lmwVar = new lmw(j, bigDecimal2, bigDecimal3, bigDecimal19, bigDecimalMultiply, bigDecimal15, bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal20, bigDecimal21, f3);
                    }
                    lmwVar2 = lmwVar;
                    i2 = 1;
                }
                aVar.b = i2;
                if (this.a.emit(lmwVar2, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public s970(k1i k1iVar, aa70 aa70Var) {
        this.a = k1iVar;
        this.b = aa70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super lmw> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
