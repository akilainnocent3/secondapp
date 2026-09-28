package defpackage;

import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.entity.SocialMineType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalSocialViewModel$onAccountChanged$1", f = "PersonalSocialViewModel.kt", l = {184}, m = "invokeSuspend", v = 2)
public final class eq00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kq00 b;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalSocialViewModel$onAccountChanged$1$2", f = "PersonalSocialViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<bba0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ kq00 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq00 kq00Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = kq00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(bba0 bba0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(bba0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            bba0 bba0Var = (bba0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bba0Var.getClass();
            this.b.F.a(bba0Var);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq00(kq00 kq00Var, v1b<? super eq00> v1bVar) {
        super(2, v1bVar);
        this.b = kq00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eq00(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((eq00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        kq00 kq00Var = this.b;
        v340 v340Var = kq00Var.C;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String lastNickName = kq00Var.e.getLastNickName();
            SocialMineType socialMineType = (lastNickName == null || !lastNickName.equalsIgnoreCase(((SocialRouter$PersonalSocial.Data) v340Var.a.getValue()).getUsername())) ? SocialMineType.NOT_MINE : SocialMineType.MINE;
            SocialRouter$PersonalSocial.Data data = (SocialRouter$PersonalSocial.Data) v340Var.a.getValue();
            kq00Var.y1(data.copy((49338 & 1) != 0 ? data.username : null, (49338 & 2) != 0 ? data.fromCreation : false, (49338 & 4) != 0 ? data.mineType : socialMineType, (49338 & 8) != 0 ? data.bookingCode : null, (49338 & 16) != 0 ? data.isCodeLive : false, (49338 & 32) != 0 ? data.previewCode : false, (49338 & 64) != 0 ? data.countryCode : null, (49338 & 128) != 0 ? data.currentCountryCode : null, (49338 & 256) != 0 ? data.region : null, (49338 & 512) != 0 ? data.avatarUrl : null, (49338 & 1024) != 0 ? data.followers : 0, (49338 & 2048) != 0 ? data.followings : 0, (49338 & 4096) != 0 ? data.isFollowed : false, (49338 & 8192) != 0 ? data.userType : null, (49338 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? data.isCreator : false, (49338 & 32768) != 0 ? data.initialTab : null));
            this.a = 1;
            Object value = kq00Var.E.a.getValue();
            lq00.c cVar = value instanceof lq00.c ? (lq00.c) value : null;
            if (cVar != null) {
                wwd0 wwd0Var = kq00Var.D;
                lq00.c cVarA = lq00.c.a(cVar, null, socialMineType, null, false, null, 32765);
                wwd0Var.getClass();
                wwd0Var.k(null, cVarA);
                unit = Unit.a;
                if (unit != y5bVar) {
                    unit = Unit.a;
                }
            } else {
                unit = Unit.a;
            }
            if (unit == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ej5.c(o8i0.d(kq00Var), null, null, new iq00(kq00Var, null), 3);
        kzh.d(new g1i(kq00Var.G, new a(kq00Var, null)), o8i0.d(kq00Var));
        return Unit.a;
    }
}
