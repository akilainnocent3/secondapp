package defpackage;

import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$observeStackerEvents$1", f = "StackerViewModel.kt", l = {174, 174}, m = "invokeSuspend", v = 1)
public final class mqd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tqd0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ tqd0 a;

        public a(tqd0 tqd0Var) {
            this.a = tqd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0050  */
        /* JADX WARN: Code duplicated, block: B:34:0x0072  */
        /* JADX WARN: Code duplicated, block: B:35:0x0077  */
        /* JADX WARN: Code duplicated, block: B:36:0x007c  */
        /* JADX WARN: Code duplicated, block: B:37:0x0081  */
        /* JADX WARN: Code duplicated, block: B:38:0x0086  */
        /* JADX WARN: Code duplicated, block: B:39:0x008b  */
        /* JADX WARN: Code duplicated, block: B:40:0x0090  */
        /* JADX WARN: Code duplicated, block: B:41:0x0095  */
        /* JADX WARN: Code duplicated, block: B:42:0x009a  */
        /* JADX WARN: Code duplicated, block: B:43:0x009f  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            and0 and0Var;
            and0 and0Var2;
            wwd0 wwd0Var;
            Object value;
            mmd0 mmd0Var = (mmd0) obj;
            mmd0 mmd0Var2 = mmd0.d;
            CMSRes cMSRes = null;
            tqd0 tqd0Var = this.a;
            if (mmd0Var == mmd0Var2) {
                ej5.c(o8i0.d(tqd0Var), null, null, new oqd0(tqd0Var, null), 3);
            }
            mmd0Var.getClass();
            int iOrdinal = mmd0Var.ordinal();
            if (iOrdinal == 0) {
                and0Var = and0.a;
            } else if (iOrdinal == 1) {
                and0Var = and0.b;
            } else if (iOrdinal == 2) {
                and0Var = and0.y;
            } else if (iOrdinal == 3) {
                and0Var = and0.z;
            } else {
                if (iOrdinal != 4) {
                    switch (iOrdinal) {
                        case 9:
                            and0Var = and0.v;
                            break;
                        case 10:
                            and0Var = and0.c;
                            break;
                        case 11:
                            and0Var = and0.d;
                            break;
                        case 12:
                            and0Var = and0.f;
                            break;
                        case 13:
                            and0Var = and0.e;
                            break;
                        default:
                            and0Var2 = null;
                            break;
                    }
                    if (and0Var2 != null) {
                        wwd0Var = tqd0Var.G;
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, aqd0.a((aqd0) value, 0.0d, 0, null, null, and0Var2, 15)));
                    }
                    switch (mmd0Var.ordinal()) {
                        case 2:
                            cMSRes = uld0.i0.X;
                            break;
                        case 3:
                            cMSRes = uld0.i0.Y;
                            break;
                        case 5:
                            cMSRes = uld0.i0.U;
                            break;
                        case 6:
                            cMSRes = uld0.i0.Z;
                            break;
                        case 7:
                            cMSRes = uld0.i0.a0;
                            break;
                        case 8:
                            cMSRes = uld0.i0.W;
                            break;
                        case 9:
                            cMSRes = uld0.i0.V;
                            break;
                        case 11:
                            cMSRes = uld0.i0.T;
                            break;
                        case 12:
                            cMSRes = uld0.i0.S;
                            break;
                        case 13:
                            cMSRes = uld0.i0.S;
                            break;
                    }
                    if (cMSRes != null && ((Boolean) tqd0Var.I.a.getValue()).booleanValue()) {
                        ((b) tqd0Var.F.getValue()).c(cMSRes);
                    }
                    return Unit.a;
                }
                and0Var = and0.w;
            }
            and0Var2 = and0Var;
            if (and0Var2 != null) {
                wwd0Var = tqd0Var.G;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, aqd0.a((aqd0) value, 0.0d, 0, null, null, and0Var2, 15)));
            }
            switch (mmd0Var.ordinal()) {
                case 2:
                    cMSRes = uld0.i0.X;
                    break;
                case 3:
                    cMSRes = uld0.i0.Y;
                    break;
                case 5:
                    cMSRes = uld0.i0.U;
                    break;
                case 6:
                    cMSRes = uld0.i0.Z;
                    break;
                case 7:
                    cMSRes = uld0.i0.a0;
                    break;
                case 8:
                    cMSRes = uld0.i0.W;
                    break;
                case 9:
                    cMSRes = uld0.i0.V;
                    break;
                case 11:
                    cMSRes = uld0.i0.T;
                    break;
                case 12:
                    cMSRes = uld0.i0.S;
                    break;
                case 13:
                    cMSRes = uld0.i0.S;
                    break;
            }
            if (cMSRes != null) {
                ((b) tqd0Var.F.getValue()).c(cMSRes);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqd0(tqd0 tqd0Var, v1b<? super mqd0> v1bVar) {
        super(2, v1bVar);
        this.b = tqd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mqd0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((mqd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (((defpackage.a390) r7).collect(r1, r6) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            tqd0 r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 == r4) goto L15
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L15:
            defpackage.uj50.b(r7)
            goto L3b
        L19:
            defpackage.uj50.b(r7)
            goto L2b
        L1d:
            defpackage.uj50.b(r7)
            xtm r7 = r3.w
            r6.a = r5
            b390 r7 = r7.invoke()
            if (r7 != r0) goto L2b
            goto L3a
        L2b:
            a390 r7 = (defpackage.a390) r7
            mqd0$a r1 = new mqd0$a
            r1.<init>(r3)
            r6.a = r4
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r0) goto L3b
        L3a:
            return r0
        L3b:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
