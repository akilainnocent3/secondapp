package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.timecontrol.TimeSelfExclusionRequest;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmrf;", "Lavw;", "Lhrf;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mrf extends avw<hrf> {
    public final jrf e;
    public final lv0 f;
    public final iv0 i;
    public final j750 v;
    public final uqm w;
    public cr10 y;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.playtimecontrol.confirmation.viewmodel.EditPlayTimeConfirmationViewModel", f = "EditPlayTimeConfirmationViewModel.kt", l = {65, 67, 77, 91, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "callTimeOut", v = 2)
    public static final class a extends x1b {
        public String a;
        public String b;
        public /* synthetic */ Object c;
        public int e;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return mrf.this.A1(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrf(jrf jrfVar, lv0 lv0Var, iv0 iv0Var, j750 j750Var, uqm uqmVar) {
        super(hrf.a.a);
        uqmVar.getClass();
        this.e = jrfVar;
        this.f = lv0Var;
        this.i = iv0Var;
        this.v = j750Var;
        this.w = uqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r2.emit(r7, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z1(int r8, defpackage.x1b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lrf
            if (r0 == 0) goto L13
            r0 = r9
            lrf r0 = (defpackage.lrf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lrf r0 = new lrf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            goto L31
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L31:
            defpackage.uj50.b(r9)
            goto La6
        L35:
            int r8 = r0.a
            defpackage.uj50.b(r9)
            goto L61
        L3b:
            defpackage.uj50.b(r9)
            r0.a = r8
            r0.d = r6
            iv0 r9 = r7.i
            lyz r9 = r9.a
            com.sporty.android.core.model.timecontrol.SelfExclusionRequest r2 = new com.sporty.android.core.model.timecontrol.SelfExclusionRequest
            r2.<init>(r8)
            lyh r9 = r9.g0(r2)
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = defpackage.vch0.b
            yzh r9 = defpackage.bm50.b(r9, r2)
            sl50 r2 = new sl50
            r2.<init>(r9)
            java.lang.Object r9 = defpackage.s0i.a(r2, r0)
            if (r9 != r1) goto L61
            goto La5
        L61:
            lk50 r9 = (defpackage.lk50) r9
            boolean r9 = r9 instanceof lk50.c
            b390 r2 = r7.c
            if (r9 == 0) goto L8c
            grf$b r9 = new grf$b
            cr10 r4 = r7.y
            if (r4 == 0) goto L86
            jrf r7 = r7.e
            r7.getClass()
            uqf r7 = defpackage.jrf.a(r4)
            r9.<init>(r7)
            r0.a = r8
            r0.d = r5
            java.lang.Object r7 = r2.emit(r9, r0)
            if (r7 != r1) goto La6
            goto La5
        L86:
            java.lang.String r7 = "typeSelected"
            kotlin.jvm.internal.Intrinsics.n(r7)
            throw r3
        L8c:
            grf$c r7 = new grf$c
            com.sporty.android.common_ui.uitext.StringUiText r9 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r9 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r3 = 2132018156(0x7f1403ec, float:1.967461E38)
            r9.<init>(r3)
            r7.<init>(r9)
            r0.a = r8
            r0.d = r4
            java.lang.Object r7 = r2.emit(r7, r0)
            if (r7 != r1) goto La6
        La5:
            return r1
        La6:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrf.z1(int, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A1(String str, String str2, v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object objA = aVar.c;
        y5b y5bVar = y5b.a;
        int i2 = aVar.e;
        if (i2 == 0) {
            uj50.b(objA);
            aVar.a = str;
            aVar.b = str2;
            aVar.e = 1;
            objA = s0i.a(new sl50(bm50.b(this.f.a.n0(new TimeSelfExclusionRequest(str2, false)), vch0.b)), aVar);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objA);
                return objA;
            }
            if (i2 == 3) {
                uj50.b(objA);
                return objA;
            }
            if (i2 == 4) {
                uj50.b(objA);
                return objA;
            }
            if (i2 == 5) {
                uj50.b(objA);
                return objA;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = aVar.b;
        str = aVar.a;
        uj50.b(objA);
        lk50 lk50Var = (lk50) objA;
        boolean z = lk50Var instanceof lk50.c;
        b390 b390Var = this.c;
        if (z) {
            cr10 cr10Var = this.y;
            if (cr10Var == null) {
                Intrinsics.n(llGRV.ILVKNA);
                throw null;
            }
            this.e.getClass();
            grf.b bVar = new grf.b(jrf.a(cr10Var));
            aVar.a = null;
            aVar.b = null;
            aVar.e = 2;
            Object objEmit = b390Var.emit(bVar, aVar);
            if (objEmit != y5bVar) {
                return objEmit;
            }
        } else if (!(lk50Var instanceof lk50.a)) {
            StringUiText stringUiText = vch0.a;
            grf.c cVar = new grf.c(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again));
            aVar.a = null;
            aVar.b = null;
            aVar.e = 5;
            Object objEmit2 = b390Var.emit(cVar, aVar);
            if (objEmit2 != y5bVar) {
                return objEmit2;
            }
        } else if (bm50.j(lk50Var, ErrorCode.INVALID) != null) {
            StringUiText stringUiText2 = vch0.a;
            grf.c cVar2 = new grf.c(new ResourceUiText(R.string.playtime_control__error_start_date_in_the_past, ay0.S(new Object[]{str})));
            aVar.a = null;
            aVar.b = null;
            aVar.e = 3;
            Object objEmit3 = b390Var.emit(cVar2, aVar);
            if (objEmit3 != y5bVar) {
                return objEmit3;
            }
        } else {
            if (bm50.j(lk50Var, 11900) != null) {
                y1(new prf(this, str, str2, null));
                return Unit.a;
            }
            StringUiText stringUiText3 = vch0.a;
            grf.c cVar3 = new grf.c(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again));
            aVar.a = null;
            aVar.b = null;
            aVar.e = 4;
            Object objEmit4 = b390Var.emit(cVar3, aVar);
            if (objEmit4 != y5bVar) {
                return objEmit4;
            }
        }
        return y5bVar;
    }
}
