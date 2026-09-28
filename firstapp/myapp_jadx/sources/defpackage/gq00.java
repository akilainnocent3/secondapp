package defpackage;

import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.entity.SocialMineType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalSocialViewModel$onUpdateUsername$1", f = "PersonalSocialViewModel.kt", l = {349}, m = "invokeSuspend", v = 2)
public final class gq00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kq00 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq00(kq00 kq00Var, String str, v1b<? super gq00> v1bVar) {
        super(2, v1bVar);
        this.b = kq00Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gq00(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gq00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0091  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        kq00 kq00Var;
        Unit unit;
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = this.c;
        kq00 kq00Var2 = this.b;
        if (i == 0) {
            uj50.b(obj);
            SocialRouter$PersonalSocial.Data data = (SocialRouter$PersonalSocial.Data) kq00Var2.C.a.getValue();
            z = true;
            kq00Var = kq00Var2;
            kq00Var.y1(data.copy((49338 & 1) != 0 ? data.username : str, (49338 & 2) != 0 ? data.fromCreation : false, (49338 & 4) != 0 ? data.mineType : null, (49338 & 8) != 0 ? data.bookingCode : null, (49338 & 16) != 0 ? data.isCodeLive : false, (49338 & 32) != 0 ? data.previewCode : false, (49338 & 64) != 0 ? data.countryCode : null, (49338 & 128) != 0 ? data.currentCountryCode : null, (49338 & 256) != 0 ? data.region : null, (49338 & 512) != 0 ? data.avatarUrl : null, (49338 & 1024) != 0 ? data.followers : 0, (49338 & 2048) != 0 ? data.followings : 0, (49338 & 4096) != 0 ? data.isFollowed : false, (49338 & 8192) != 0 ? data.userType : null, (49338 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? data.isCreator : false, (49338 & 32768) != 0 ? data.initialTab : null));
            this.a = 1;
            Object value = kq00Var.E.a.getValue();
            lq00.c cVar = value instanceof lq00.c ? (lq00.c) value : null;
            if (cVar != null) {
                wwd0 wwd0Var = kq00Var.D;
                lq00.c cVarA = lq00.c.a(cVar, str, null, null, false, null, 32766);
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
            z = true;
            kq00Var = kq00Var2;
        }
        oaa0 oaa0Var = oaa0.a;
        String avatarUrl = ((SocialRouter$PersonalSocial.Data) kq00Var.C.a.getValue()).getAvatarUrl();
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        boolean z2 = ((SocialRouter$PersonalSocial.Data) kq00Var.C.a.getValue()).getMineType() == SocialMineType.MINE ? z : false;
        oaa0Var.getClass();
        oaa0.a(str, avatarUrl, z2);
        return Unit.a;
    }
}
