package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import com.sportybet.android.social.domain.entity.SocialMineType;
import com.sportybet.feature.recap.presentation.RecapActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cj00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cj00(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lyh gzhVar;
        yzh yzhVarB;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                el00 el00Var = (el00) obj3;
                v340 v340Var = el00Var.y;
                Function0 function0 = (Function0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    uwd0<T> uwd0Var = v340Var.a;
                    String username = ((SocialRouter$PersonalSocial.Data) uwd0Var.getValue()).getUsername();
                    CountryCodeName region = ((SocialRouter$PersonalSocial.Data) uwd0Var.getValue()).getRegion();
                    SocialMineType mineType = ((SocialRouter$PersonalSocial.Data) uwd0Var.getValue()).getMineType();
                    dja0 userType = ((SocialRouter$PersonalSocial.Data) uwd0Var.getValue()).getUserType();
                    String bookingCode = ((SocialRouter$PersonalSocial.Data) uwd0Var.getValue()).getBookingCode();
                    boolean zIsCodeLive = ((SocialRouter$PersonalSocial.Data) uwd0Var.getValue()).isCodeLive();
                    if (((SocialRouter$PersonalSocial.Data) uwd0Var.getValue()).getPreviewCode() && bookingCode != null && bookingCode.length() != 0) {
                        if (zIsCodeLive) {
                            ej5.c(o8i0.d(el00Var), null, null, new zk00(el00Var, qm00.d.a, null), 3);
                        } else {
                            vha0 vha0Var = el00Var.e;
                            boolean z = mineType == SocialMineType.MINE;
                            vga0 vga0Var = vha0Var.a;
                            username.getClass();
                            if (z) {
                                yzhVarB = bm50.b(vga0Var.n(bookingCode), vch0.b);
                            } else {
                                if (username.length() <= 0 || bookingCode.length() <= 0) {
                                    gzhVar = new gzh(new lk50.a(r8a0.a));
                                } else {
                                    yzhVarB = bm50.b(vga0Var.d(username, bookingCode), vch0.b);
                                }
                                kzh.d(new g1i(new fl00(gzhVar, username, region, userType, bookingCode), new gl00(null, el00Var)), o8i0.d(el00Var));
                            }
                            gzhVar = yzhVarB;
                            kzh.d(new g1i(new fl00(gzhVar, username, region, userType, bookingCode), new gl00(null, el00Var)), o8i0.d(el00Var));
                        }
                    }
                } else {
                    ej5.c(o8i0.d(el00Var), null, null, new zk00(el00Var, qm00.c.a, null), 3);
                    SocialRouter$PersonalSocial.Data data = (SocialRouter$PersonalSocial.Data) v340Var.a.getValue();
                    el00Var.A1(data.copy((49338 & 1) != 0 ? data.username : null, (49338 & 2) != 0 ? data.fromCreation : false, (49338 & 4) != 0 ? data.mineType : null, (49338 & 8) != 0 ? data.bookingCode : null, (49338 & 16) != 0 ? data.isCodeLive : false, (49338 & 32) != 0 ? data.previewCode : false, (49338 & 64) != 0 ? data.countryCode : null, (49338 & 128) != 0 ? data.currentCountryCode : null, (49338 & 256) != 0 ? data.region : null, (49338 & 512) != 0 ? data.avatarUrl : null, (49338 & 1024) != 0 ? data.followers : 0, (49338 & 2048) != 0 ? data.followings : 0, (49338 & 4096) != 0 ? data.isFollowed : false, (49338 & 8192) != 0 ? data.userType : null, (49338 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? data.isCreator : false, (49338 & 32768) != 0 ? data.initialTab : null), false, false);
                    function0.invoke();
                }
                break;
            default:
                final RecapActivity recapActivity = (RecapActivity) obj3;
                final twd0 twd0Var = (twd0) obj2;
                ghx ghxVar = (ghx) obj;
                int i2 = RecapActivity.f;
                ghxVar.getClass();
                hhx.b(ghxVar, "ANALYZE", null, new op8(-1496900611, new iaj() { // from class: oc40
                    @Override // defpackage.iaj
                    public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                        a aVar = (a) obj6;
                        ((Integer) obj7).getClass();
                        int i3 = RecapActivity.f;
                        ((pf0) obj4).getClass();
                        ((ifx) obj5).getClass();
                        twd0 twd0Var2 = twd0Var;
                        boolean z2 = ((pf40) twd0Var2.getValue()).f != null;
                        boolean z3 = ((pf40) twd0Var2.getValue()).d;
                        sf40 sf40Var = (sf40) recapActivity.b.getValue();
                        boolean zA = aVar.A(sf40Var);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            RecapActivity.a aVar2 = new RecapActivity.a(1, sf40Var, sf40.class, "handleAction", "handleAction(Lcom/sportybet/feature/recap/presentation/model/RecapAction;)V", 0);
                            aVar.r(aVar2);
                            objY = aVar2;
                        }
                        zc40.a(0, aVar, null, (Function1) ((chp) objY), z2, z3);
                        return Unit.a;
                    }
                }, true), 254);
                hhx.b(ghxVar, "RESULT", null, new op8(13988404, new iaj() { // from class: pc40
                    @Override // defpackage.iaj
                    public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                        a aVar = (a) obj6;
                        ((Integer) obj7).getClass();
                        int i3 = RecapActivity.f;
                        ((pf0) obj4).getClass();
                        ((ifx) obj5).getClass();
                        pf40 pf40Var = (pf40) twd0Var.getValue();
                        sf40 sf40Var = (sf40) recapActivity.b.getValue();
                        boolean zA = aVar.A(sf40Var);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            RecapActivity.b bVar = new RecapActivity.b(1, sf40Var, sf40.class, "handleAction", "handleAction(Lcom/sportybet/feature/recap/presentation/model/RecapAction;)V", 0);
                            aVar.r(bVar);
                            objY = bVar;
                        }
                        af40.d(pf40Var, (Function1) ((chp) objY), aVar, 8);
                        return Unit.a;
                    }
                }, true), 254);
                break;
        }
        return Unit.a;
    }
}
