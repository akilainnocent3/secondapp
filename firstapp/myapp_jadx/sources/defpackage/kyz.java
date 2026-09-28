package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.AvatarFrame;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class kyz implements iyz {
    public final xxz a;
    public final odd b;
    public final crm c;
    public final str<mgb0> d;
    public final mpe0 e;

    @c0d(c = "com.sporty.android.core.data.repository.patron.profile.PatronProfileRepositoryImpl$getAccountInfo$1", f = "PatronProfileRepository.kt", l = {46}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super AccountInfo>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return kyz.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super AccountInfo> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws uu5 {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                kyz kyzVar = kyz.this;
                if (!kyzVar.d.get().isLogin()) {
                    throw new uu5();
                }
                xxz xxzVar = kyzVar.a;
                this.a = 1;
                obj = xxzVar.G0(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return (AccountInfo) n52.b((BaseResponse) obj);
        }
    }

    @c0d(c = "com.sporty.android.core.data.repository.patron.profile.PatronProfileRepositoryImpl$getAccountInfo$2", f = "PatronProfileRepository.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends AccountInfo>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = kyz.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends AccountInfo> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (lk50Var instanceof lk50.c) {
                    AccountInfo accountInfo = (AccountInfo) ((lk50.c) lk50Var).a;
                    crm crmVar = kyz.this.c;
                    String avatar = accountInfo.getAvatar();
                    AvatarFrame avatarFrame = accountInfo.getAvatarFrame();
                    Integer num = new Integer(accountInfo.getLoyaltyCurrentTier());
                    Integer num2 = new Integer(accountInfo.getLoyaltyHistoryHighestTier());
                    this.b = null;
                    this.a = 1;
                    if (crmVar.b(avatar, avatarFrame, num, num2, this) == y5bVar) {
                        return y5bVar;
                    }
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

    public kyz(xxz xxzVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, crm crmVar, str strVar) {
        xxzVar.getClass();
        crmVar.getClass();
        strVar.getClass();
        this.a = xxzVar;
        this.b = oddVar;
        this.c = crmVar;
        this.d = strVar;
        this.e = hwr.b(new jyz());
    }

    @Override // defpackage.iyz
    public final lyh<lk50<AccountInfo>> a(pu0 pu0Var) {
        pu0Var.getClass();
        return ozh.c(new g1i(su0.a((ztw) this.e.getValue(), pu0Var, new a(null)), new b(null)), this.b);
    }

    @Override // defpackage.iyz
    public final void b() {
        ((ztw) this.e.getValue()).setValue(lk50.b.a);
    }
}
