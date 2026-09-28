package com.sportybet.feature.kyc.confirmAccountInfo;

import com.sporty.android.core.model.patron.PersonalInfo;
import defpackage.c0d;
import defpackage.fsa;
import defpackage.itf0;
import defpackage.lk50;
import defpackage.lyz;
import defpackage.myh;
import defpackage.oxc;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoViewModel$fetchPersonalInfo$1", f = "ConfirmAccountInfoViewModel.kt", l = {281, 283}, m = "invokeSuspend", v = 2)
public final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public lyz a;
    public int b;
    public final /* synthetic */ f c;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a<T> implements myh {
        public final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            String lastName;
            String firstName;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            f fVar = this.a;
            if (z) {
                PersonalInfo personalInfo = (PersonalInfo) ((lk50.c) lk50Var).a;
                return (!personalInfo.isEligible() || (lastName = personalInfo.getLastName()) == null || lastName.length() == 0 || (firstName = personalInfo.getFirstName()) == null || firstName.length() == 0) ? fVar.C.emit(com.sportybet.feature.kyc.confirmAccountInfo.a.f.a, v1bVar) : fVar.C.emit(new com.sportybet.feature.kyc.confirmAccountInfo.a.e(oxc.a(personalInfo.getFirstName(), " ", personalInfo.getLastName())), v1bVar);
            }
            if (lk50Var instanceof lk50.a) {
                wwd0 wwd0Var = fVar.B;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, fsa.a((fsa) value, 0, null, null, false, false, false, true, false, 767)));
            } else {
                itf0.a.a("fetchPersonalInfo is Loading", new Object[0]);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v1b v1bVar, f fVar) {
        super(2, v1bVar);
        this.c = fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g(v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L15;
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
            int r1 = r6.b
            com.sportybet.feature.kyc.confirmAccountInfo.f r2 = r6.c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1a
            if (r1 != r3) goto L13
            defpackage.uj50.b(r7)
            goto L4e
        L13:
            r6 = 0
            java.lang.String r6 = com.sporty.android.permission.location.KN.qUnCRF.VCzTejunsKELM
            defpackage.ib5.a(r6)
            return r4
        L1a:
            lyz r1 = r6.a
            defpackage.uj50.b(r7)
            goto L32
        L20:
            defpackage.uj50.b(r7)
            lyz r1 = r2.a
            mgb0 r7 = r2.b
            r6.a = r1
            r6.b = r5
            java.lang.Object r7 = r7.getUserId(r6)
            if (r7 != r0) goto L32
            goto L4d
        L32:
            java.lang.String r7 = (java.lang.String) r7
            lyh r7 = r1.c(r7)
            com.sporty.android.common_ui.uitext.ResourceUiText r1 = defpackage.vch0.b
            yzh r7 = defpackage.bm50.b(r7, r1)
            com.sportybet.feature.kyc.confirmAccountInfo.g$a r1 = new com.sportybet.feature.kyc.confirmAccountInfo.g$a
            r1.<init>(r2)
            r6.a = r4
            r6.b = r3
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.kyc.confirmAccountInfo.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
