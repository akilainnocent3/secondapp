package defpackage;

import com.sporty.android.book.domain.entity.MarketingServiceType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$validateMarketingService$1", f = "BetSlipViewModel.kt", l = {1690, 1693, 1696, 1699, 1700, 1701}, m = "invokeSuspend", v = 2)
public final class h83 extends tje0 implements Function2<isu, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q73 d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MarketingServiceType.values().length];
            try {
                iArr[MarketingServiceType.BONUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketingServiceType.GIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketingServiceType.LIVE_ODDS_BOOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h83(q73 q73Var, v1b v1bVar, boolean z) {
        super(2, v1bVar);
        this.c = z;
        this.d = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h83 h83Var = new h83(this.d, v1bVar, this.c);
        h83Var.b = obj;
        return h83Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(isu isuVar, v1b<? super Unit> v1bVar) {
        return ((h83) create(isuVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r9 == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r9 == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r9 == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (r9 == r4) goto L42;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            q73 r0 = r8.d
            ku90<jsu> r1 = r0.b1
            ku90<jsu> r2 = r0.Z0
            ku90<jsu> r0 = r0.Y0
            java.lang.Object r3 = r8.b
            isu r3 = (defpackage.isu) r3
            y5b r4 = defpackage.y5b.a
            int r5 = r8.a
            r6 = 0
            switch(r5) {
                case 0: goto L34;
                case 1: goto L2f;
                case 2: goto L2a;
                case 3: goto L26;
                case 4: goto L22;
                case 5: goto L1e;
                case 6: goto L1a;
                default: goto L14;
            }
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r6
        L1a:
            defpackage.uj50.b(r9)
            goto L81
        L1e:
            defpackage.uj50.b(r9)
            goto L71
        L22:
            defpackage.uj50.b(r9)
            goto L61
        L26:
            defpackage.uj50.b(r9)
            goto L91
        L2a:
            defpackage.uj50.b(r9)
            goto La1
        L2f:
            defpackage.uj50.b(r9)
            goto Lb1
        L34:
            defpackage.uj50.b(r9)
            boolean r9 = r8.c
            if (r9 != 0) goto L3e
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L3e:
            com.sporty.android.book.domain.entity.MarketingServiceType r9 = r3.a
            jsu r5 = r3.b
            int[] r7 = h83.a.a
            int r9 = r9.ordinal()
            r9 = r7[r9]
            r7 = 1
            if (r9 == r7) goto La4
            r7 = 2
            if (r9 == r7) goto L94
            r7 = 3
            if (r9 == r7) goto L84
            r8.b = r3
            r9 = 4
            r8.a = r9
            b390 r9 = r0.a
            java.lang.Object r9 = r9.emit(r5, r8)
            if (r9 != r4) goto L61
            goto Lb0
        L61:
            jsu r9 = r3.b
            r8.b = r3
            r0 = 5
            r8.a = r0
            b390 r0 = r2.a
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r4) goto L71
            goto Lb0
        L71:
            jsu r9 = r3.b
            r8.b = r6
            r0 = 6
            r8.a = r0
            b390 r0 = r1.a
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r4) goto L81
            goto Lb0
        L81:
            kotlin.Unit r9 = (kotlin.Unit) r9
            goto Lb3
        L84:
            r8.b = r6
            r8.a = r7
            b390 r9 = r1.a
            java.lang.Object r9 = r9.emit(r5, r8)
            if (r9 != r4) goto L91
            goto Lb0
        L91:
            kotlin.Unit r9 = (kotlin.Unit) r9
            goto Lb3
        L94:
            r8.b = r6
            r8.a = r7
            b390 r9 = r2.a
            java.lang.Object r9 = r9.emit(r5, r8)
            if (r9 != r4) goto La1
            goto Lb0
        La1:
            kotlin.Unit r9 = (kotlin.Unit) r9
            goto Lb3
        La4:
            r8.b = r6
            r8.a = r7
            b390 r9 = r0.a
            java.lang.Object r9 = r9.emit(r5, r8)
            if (r9 != r4) goto Lb1
        Lb0:
            return r4
        Lb1:
            kotlin.Unit r9 = (kotlin.Unit) r9
        Lb3:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h83.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
