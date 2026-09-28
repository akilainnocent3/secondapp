package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.platform.features.account.addemailprompt.c;
import com.sporty.android.platform.features.account.addemailprompt.d;
import com.sporty.android.platform.features.account.addemailprompt.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.addemailprompt.AddEmailPromptViewModel$bindEmail$1", f = "AddEmailPromptViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class ah extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    @c0d(c = "com.sporty.android.platform.features.account.addemailprompt.AddEmailPromptViewModel$bindEmail$1$1$1", f = "AddEmailPromptViewModel.kt", l = {107, 107}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<String>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ e d;
        public final /* synthetic */ String e;
        public final /* synthetic */ CaptchaHeader f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, String str, CaptchaHeader captchaHeader, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = eVar;
            this.e = str;
            this.f = captchaHeader;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, this.e, this.f, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<String>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r8)
                goto L4e
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L1b:
                myh r0 = r7.a
                defpackage.uj50.b(r8)
                goto L41
            L21:
                defpackage.uj50.b(r8)
                com.sporty.android.platform.features.account.addemailprompt.e r8 = r7.d
                lyz r8 = r8.b
                com.sporty.android.core.model.captcha.CaptchaHeader r2 = r7.f
                java.lang.String r6 = r2.getUuid()
                java.lang.String r2 = r2.getToken()
                r7.c = r5
                r7.a = r0
                r7.b = r4
                java.lang.String r4 = r7.e
                java.lang.Object r8 = r8.k(r4, r6, r2, r7)
                if (r8 != r1) goto L41
                goto L4d
            L41:
                r7.c = r5
                r7.a = r5
                r7.b = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L4e
            L4d:
                return r1
            L4e:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ah.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ e a;
        public final /* synthetic */ String b;

        public b(e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            lk50 lk50Var = (lk50) obj;
            e eVar = this.a;
            wwd0 wwd0Var = eVar.f;
            if (Intrinsics.g(lk50Var, lk50.b.a)) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, c.a((c) value3, null, uxs.LOADING, null, null, 13)));
            } else if (lk50Var instanceof lk50.c) {
                BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                int i = baseResponse.bizCode;
                if (i != 10000) {
                    String str = baseResponse.message;
                    if (i == 12000) {
                        eVar.x1(str, R.string.common_info_setting__user_already_bind_email, uxs.DISABLE);
                    } else if (i != 12001) {
                        eVar.x1(str, R.string.common_feedback__something_went_wrong_tip, uxs.ENABLE);
                    } else {
                        eVar.x1(str, R.string.my_account__this_email_is_linked_to_another_account_etc, uxs.DISABLE);
                    }
                } else {
                    ej5.c(eVar.e, null, null, new bh(eVar, null), 3);
                    eVar.c.a(yg.a, k00.c);
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, c.a((c) value2, null, uxs.ENABLE, null, new d.b(this.b), 5)));
                }
            } else {
                if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                SprThrowable sprThrowableH = bm50.h(lk50Var);
                UiText uiTextB = ((lk50.a) lk50Var).b;
                if (Intrinsics.g(uiTextB, vch0.a)) {
                    uiTextB = sprThrowableH != null ? sprThrowableH.b() : new ResourceUiText(R.string.common_feedback__something_went_wrong_tip);
                }
                UiText uiText = uiTextB;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, c.a((c) value, null, uxs.ENABLE, uiText, null, 9)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(e eVar, String str, String str2, v1b<? super ah> v1bVar) {
        super(2, v1bVar);
        this.c = eVar;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ah ahVar = new ah(this.c, this.d, this.e, v1bVar);
        ahVar.b = obj;
        return ahVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ah) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final e eVar = this.c;
            fe6 fe6Var = eVar.a;
            j6c j6cVar = j6c.VERIFY_EMAIL;
            String str = this.d;
            CaptchaData.Email email = new CaptchaData.Email(str);
            final String str2 = this.e;
            yzh yzhVarA = bm50.a(fe6Var.a(j6cVar, email, v5bVar, new Function1() { // from class: zg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return new or60(new ah.a(eVar, str2, (CaptchaHeader) obj2, null));
                }
            }));
            b bVar = new b(eVar, str);
            this.b = null;
            this.a = 1;
            if (yzhVarA.collect(bVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
