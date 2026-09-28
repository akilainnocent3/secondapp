package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.viewmodel.ChangeUserInfoViewModel$bindEmail$1", f = "ChangeUserInfoViewModel.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class h67 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i67 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    @c0d(c = "com.sportybet.android.user.viewmodel.ChangeUserInfoViewModel$bindEmail$1$1$1", f = "ChangeUserInfoViewModel.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<String>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ i67 d;
        public final /* synthetic */ String e;
        public final /* synthetic */ CaptchaHeader f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i67 i67Var, String str, CaptchaHeader captchaHeader, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = i67Var;
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
                i67 r8 = r7.d
                lyz r8 = r8.e
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
            throw new UnsupportedOperationException("Method not decompiled: h67.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.user.viewmodel.ChangeUserInfoViewModel$bindEmail$1$2", f = "ChangeUserInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends BaseResponse<String>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ i67 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i67 i67Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = i67Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends BaseResponse<String>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50<BaseResponse<String>> lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.f.m(lk50Var);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h67(i67 i67Var, String str, String str2, v1b v1bVar) {
        super(2, v1bVar);
        j6c j6cVar = j6c.INITIAL;
        this.c = i67Var;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j6c j6cVar = j6c.INITIAL;
        h67 h67Var = new h67(this.c, this.d, this.e, v1bVar);
        h67Var.b = obj;
        return h67Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h67) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final i67 i67Var = this.c;
            fe6 fe6Var = i67Var.d;
            j6c j6cVar = j6c.VERIFY_EMAIL;
            CaptchaData.Email email = new CaptchaData.Email(this.d);
            final String str = this.e;
            yzh yzhVarA = bm50.a(fe6Var.a(j6cVar, email, v5bVar, new Function1() { // from class: g67
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return new or60(new h67.a(i67Var, str, (CaptchaHeader) obj2, null));
                }
            }));
            b bVar = new b(i67Var, null);
            this.b = null;
            this.a = 1;
            Object objCollect = yzhVarA.collect(new g1i.a(gyx.a, bVar), this);
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect != y5bVar) {
                objCollect = Unit.a;
            }
            if (objCollect == y5bVar) {
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
