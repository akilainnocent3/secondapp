package defpackage;

import android.net.Uri;
import com.sportybet.model.cashOut.STVPlayerDataSource;
import com.sportybet.plugin.realsports.data.LiveStreamDataBetGenius;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.usecase.GetSTVPlayerDataUseCase$getBetGeniusSTVPlayerData$2", f = "GetSTVPlayerDataUseCase.kt", l = {167}, m = "invokeSuspend", v = 2)
public final class cdk extends tje0 implements Function2<v5b, v1b<? super STVPlayerDataSource.BetGeniusSource>, Object> {
    public String a;
    public LiveStreamDataBetGenius b;
    public String c;
    public String d;
    public int e;
    public final /* synthetic */ hdk f;
    public final /* synthetic */ LiveStreamDataBetGenius i;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdk(hdk hdkVar, LiveStreamDataBetGenius liveStreamDataBetGenius, String str, v1b<? super cdk> v1bVar) {
        super(2, v1bVar);
        this.f = hdkVar;
        this.i = liveStreamDataBetGenius;
        this.v = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cdk(this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super STVPlayerDataSource.BetGeniusSource> v1bVar) {
        return ((cdk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        String str;
        LiveStreamDataBetGenius liveStreamDataBetGenius;
        String str2;
        y5b y5bVar = y5b.a;
        int i = this.e;
        LiveStreamDataBetGenius liveStreamDataBetGenius2 = this.i;
        hdk hdkVar = this.f;
        if (i == 0) {
            uj50.b(obj);
            String host = Uri.parse(hdkVar.g.a("https", new String[0])).getHost();
            if (host == null) {
                host = "";
            }
            lowerCase = hdkVar.d.getCountryCode().getCode().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            ysm ysmVar = hdkVar.i;
            this.a = host;
            this.b = liveStreamDataBetGenius2;
            this.c = lowerCase;
            String str3 = this.v;
            this.d = str3;
            this.e = 1;
            Object objD = ysmVar.d(this);
            if (objD == y5bVar) {
                return y5bVar;
            }
            String str4 = host;
            obj = objD;
            str = str4;
            liveStreamDataBetGenius = liveStreamDataBetGenius2;
            str2 = str3;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.d;
            lowerCase = this.c;
            liveStreamDataBetGenius = this.b;
            str = this.a;
            uj50.b(obj);
        }
        String string = liveStreamDataBetGenius.getUri(lowerCase, str2, ((ysm.a) obj).a, str).toString();
        string.getClass();
        String lastAccessToken = hdkVar.h.getLastAccessToken();
        lastAccessToken.getClass();
        return new STVPlayerDataSource.BetGeniusSource(string, lastAccessToken, liveStreamDataBetGenius2.playerRatio, liveStreamDataBetGenius2.platform, liveStreamDataBetGenius2.getEnableScreenProtection());
    }
}
