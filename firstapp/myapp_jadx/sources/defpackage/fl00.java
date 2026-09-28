package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.data.remote.entity.SocShareCode;
import com.sportybet.android.social.data.remote.entity.SocShareCodeDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class fl00 implements lyh<qm00> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CountryCodeName c;
    public final /* synthetic */ dja0 d;
    public final /* synthetic */ String e;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$startPreviewCodeState$$inlined$map$1", f = "PersonalCodeViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return fl00.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ String b;
        public final /* synthetic */ CountryCodeName c;
        public final /* synthetic */ dja0 d;
        public final /* synthetic */ String e;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$startPreviewCodeState$$inlined$map$1$2", f = "PersonalCodeViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, String str, CountryCodeName countryCodeName, dja0 dja0Var, String str2) {
            this.a = myhVar;
            this.b = str;
            this.c = countryCodeName;
            this.d = dja0Var;
            this.e = str2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
            qm00 bVar;
            String code;
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
                String str = this.b;
                if (z) {
                    SocShareCode socShareCode = (SocShareCode) ((lk50.c) lk50Var).a;
                    socShareCode.getClass();
                    dja0 dja0Var = this.d;
                    dja0Var.getClass();
                    String shareCode = socShareCode.getShareCode();
                    double totalOdds = socShareCode.getTotalOdds();
                    int foldsAmount = socShareCode.getFoldsAmount();
                    String userId = socShareCode.getUserId();
                    long deadline = socShareCode.getDeadline();
                    long createTime = socShareCode.getCreateTime();
                    List<SocShareCodeDetail> shareCodeDetail = socShareCode.getShareCodeDetail();
                    ArrayList arrayList = new ArrayList(l48.r(shareCodeDetail, 10));
                    for (SocShareCodeDetail socShareCodeDetail : shareCodeDetail) {
                        socShareCodeDetail.getClass();
                        arrayList.add(new jl00(socShareCodeDetail.getEventId(), b3.T(socShareCodeDetail.getEventId()), socShareCodeDetail.getStartTime(), socShareCodeDetail.getEndTime(), socShareCodeDetail.getHomeTeamName(), socShareCodeDetail.getAwayTeamName(), socShareCodeDetail.getMarketId(), socShareCodeDetail.getMarketDescription(), socShareCodeDetail.getOutcomeId(), socShareCodeDetail.getOutcomeDescription(), socShareCodeDetail.getOdds(), socShareCodeDetail.getSportId(), socShareCodeDetail.getTournamentId(), socShareCodeDetail.getTournamentIcon(), socShareCodeDetail.getTournamentName(), null));
                    }
                    String note = socShareCode.getNote();
                    z320.a aVar2 = z320.c;
                    String liabilityLevel = socShareCode.getLiabilityLevel();
                    aVar2.getClass();
                    z320 z320VarA = z320.a.a(liabilityLevel);
                    Boolean boolIsCreatorBookingCode = socShareCode.isCreatorBookingCode();
                    bVar = new qm00.a(new kl00(shareCode, totalOdds, foldsAmount, userId, deadline, createTime, str, z320VarA, boolIsCreatorBookingCode != null ? boolIsCreatorBookingCode.booleanValue() : false, null, this.c, dja0Var, note, arrayList, 115200));
                } else if (lk50Var instanceof lk50.a) {
                    Pair pair = new Pair("bookingCode", this.e);
                    Pair pair2 = new Pair("username", str);
                    CountryCodeName countryCodeName = this.c;
                    if (countryCodeName == null || (code = countryCodeName.getCode()) == null) {
                        code = "";
                    }
                    List listK = kotlin.collections.b.k(pair, pair2, new Pair("countryCode", code));
                    lk50.a aVar3 = (lk50.a) lk50Var;
                    Throwable th = aVar3.a;
                    w950.a("PersonalCodeViewModel", "ShareCodeUseCase.getShareCode", th, listK);
                    bVar = ((th instanceof SprThrowable) && ((SprThrowable) th).getD() == 19000) ? qm00.d.a : new qm00.b(th, aVar3.b);
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    bVar = qm00.c.a;
                }
                aVar.b = 1;
                if (this.a.emit(bVar, aVar) == y5bVar) {
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

    public fl00(lyh lyhVar, String str, CountryCodeName countryCodeName, dja0 dja0Var, String str2) {
        this.a = lyhVar;
        this.b = str;
        this.c = countryCodeName;
        this.d = dja0Var;
        this.e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super qm00> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c, this.d, this.e);
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
