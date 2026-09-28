package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.patron.UpdateNicknameResponse;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class y0x implements lyh<k8a0> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ d1x b;
    public final /* synthetic */ String c;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$confirm$$inlined$map$2", f = "MySocialCreationViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return y0x.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ d1x b;
        public final /* synthetic */ String c;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$confirm$$inlined$map$2$2", f = "MySocialCreationViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, d1x d1xVar, String str) {
            this.a = myhVar;
            this.b = d1xVar;
            this.c = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            k8a0.c cVar;
            Object cVar2;
            d1x d1xVar = this.b;
            cb cbVar = d1xVar.e;
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
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                lk50 lk50Var = (lk50) obj;
                boolean z = lk50Var instanceof lk50.c;
                String str = this.c;
                if (z) {
                    BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                    if (baseResponse.isSuccessful()) {
                        d1xVar.f.loadAccountInfo(null);
                        CountryCodeName countryCode = d1xVar.w.getCountryCode();
                        AccountInfo accountInfoLastAccountInfo = d1xVar.i.lastAccountInfo();
                        cVar2 = new k8a0.a(str, countryCode, accountInfoLastAccountInfo != null ? accountInfoLastAccountInfo.isCreator() : null);
                    } else {
                        int i3 = baseResponse.bizCode;
                        if (i3 == 11011) {
                            cbVar.getClass();
                            boolean zA = cb.a(str);
                            ResourceUiText resourceUiTextY1 = d1x.y1(Integer.valueOf(baseResponse.bizCode));
                            UpdateNicknameResponse updateNicknameResponse = (UpdateNicknameResponse) baseResponse.data;
                            List<String> suggestedNicknames = updateNicknameResponse != null ? updateNicknameResponse.getSuggestedNicknames() : null;
                            if (suggestedNicknames == null) {
                                suggestedNicknames = m2g.a;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (T t : suggestedNicknames) {
                                if (!StringsKt.U((String) t)) {
                                    arrayList.add(t);
                                }
                            }
                            cVar2 = new k8a0.c(resourceUiTextY1, zA, (List<String>) CollectionsKt.A0(CollectionsKt.D0(arrayList)));
                        } else if (i3 == 11017) {
                            cbVar.getClass();
                            cVar = new k8a0.c(d1x.y1(Integer.valueOf(baseResponse.bizCode)), cb.a(str), 4);
                            cVar2 = cVar;
                        } else {
                            cbVar.getClass();
                            cVar2 = new k8a0.c((ResourceUiText) null, cb.a(str), 5);
                        }
                    }
                } else if (lk50Var instanceof lk50.a) {
                    cbVar.getClass();
                    boolean zA2 = cb.a(str);
                    Throwable th = ((lk50.a) lk50Var).a;
                    SprThrowable sprThrowable = th instanceof SprThrowable ? (SprThrowable) th : null;
                    cVar = new k8a0.c(d1x.y1(sprThrowable != null ? Integer.valueOf(sprThrowable.getD()) : null), zA2, 4);
                    cVar2 = cVar;
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    cVar2 = k8a0.d.a;
                }
                aVar.b = 1;
                if (this.a.emit(cVar2, aVar) == y5bVar) {
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

    public y0x(lyh lyhVar, d1x d1xVar, String str) {
        this.a = lyhVar;
        this.b = d1xVar;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super k8a0> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c);
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
