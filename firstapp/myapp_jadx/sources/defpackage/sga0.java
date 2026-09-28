package defpackage;

import android.util.Pair;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.data.remote.entity.SocialMetaData;
import com.sportybet.android.social.domain.entity.SocialMineType;
import com.sportybet.android.social.domain.entity.SocialProfileState;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class sga0 implements lyh<lk50<? extends SocialProfileState>> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uga0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ CountryCodeName e;

    @c0d(c = "com.sportybet.android.social.domain.usecase.SocialProfileUseCase$getSocialProfileState$getSocialMetaData$$inlined$map$1", f = "SocialProfileUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return sga0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ uga0 c;
        public final /* synthetic */ String d;
        public final /* synthetic */ CountryCodeName e;

        @c0d(c = "com.sportybet.android.social.domain.usecase.SocialProfileUseCase$getSocialProfileState$getSocialMetaData$$inlined$map$1$2", f = "SocialProfileUseCase.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, boolean z, uga0 uga0Var, String str, CountryCodeName countryCodeName) {
            this.a = myhVar;
            this.b = z;
            this.c = uga0Var;
            this.d = str;
            this.e = countryCodeName;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0087 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x0089  */
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
            String avatarUrl = null;
            if (i2 == 0) {
                uj50.b(obj2);
                Object cVar = (lk50) obj;
                boolean z = cVar instanceof lk50.c;
                String str = this.d;
                if (z) {
                    boolean z2 = this.b;
                    SocialMineType socialMineType = z2 ? SocialMineType.MINE : SocialMineType.NOT_MINE;
                    CountryCodeName.Companion companion = CountryCodeName.INSTANCE;
                    SocialMetaData socialMetaData = (SocialMetaData) ((lk50.c) cVar).a;
                    CountryCodeName countryCodeNameFromCode = companion.fromCode(socialMetaData.getCountry());
                    String region = socialMetaData.getRegion();
                    if (region == null) {
                        region = socialMetaData.getCountry();
                    }
                    CountryCodeName countryCodeNameFromCode2 = companion.fromCode(region);
                    String avatar = socialMetaData.getAvatar();
                    uga0 uga0Var = this.c;
                    if (avatar != null) {
                        if (StringsKt.U(avatar)) {
                            avatar = null;
                        }
                        if (avatar != null) {
                            avatarUrl = uga0Var.e.e(avatar);
                        } else if (z2) {
                            avatarUrl = uga0Var.d.getAvatarUrl();
                        }
                    } else if (z2) {
                        avatarUrl = uga0Var.d.getAvatarUrl();
                    }
                    cVar = new lk50.c(new SocialProfileState(str, true, socialMineType, countryCodeNameFromCode, countryCodeNameFromCode2, avatarUrl, socialMetaData.getFollowings(), socialMetaData.getFollowers(), socialMetaData.isFollowed(), socialMetaData.getSocialUserType(), socialMetaData.getBio()));
                } else if (cVar instanceof lk50.a) {
                    w950.a("SocialProfileUseCase", "getSocialMetaData", ((lk50.a) cVar).a, kotlin.collections.b.k(new Pair("username", str), new Pair("countryCode", this.e.getCode())));
                    SocialMineType socialMineType2 = SocialMineType.INVALID;
                    dja0 dja0Var = dja0.b;
                    CountryCodeName countryCodeName = this.e;
                    cVar = new lk50.c(new SocialProfileState(str, false, socialMineType2, countryCodeName, countryCodeName, null, 0, 0, false, dja0Var, null));
                } else if (!(cVar instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                aVar.b = 1;
                if (this.a.emit(cVar, aVar) == y5bVar) {
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

    public sga0(yzh yzhVar, boolean z, uga0 uga0Var, String str, CountryCodeName countryCodeName) {
        this.a = yzhVar;
        this.b = z;
        this.c = uga0Var;
        this.d = str;
        this.e = countryCodeName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super lk50<? extends SocialProfileState>> myhVar, v1b v1bVar) {
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
