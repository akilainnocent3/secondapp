package defpackage;

import com.sportybet.plugin.realsports.streaming.provider.perform.api.data.PerformStreamResp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JI\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lrd00;", "", "", "authorization", "referer", "authKey", "streamUuid", "Lsu5;", "Lcom/sportybet/plugin/realsports/streaming/provider/perform/api/data/PerformStreamResp;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lsu5;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface rd00 {
    @sbj("/livestreamlaunch/{outletAuthKey}/{streamUuid}?_rt=c&_fmt=json&_fld=sl,aLng,pa,pCfg,sTok&aLng=en-gb,xx-xx")
    su5<PerformStreamResp> a(@rhl("Authorization") String authorization, @rhl("Referer") String referer, @dxz("outletAuthKey") String authKey, @dxz("streamUuid") String streamUuid);

    @sbj("/livestreamlaunch/{outletAuthKey}/{streamUuid}?_rt=c&_fmt=json&_fld=sl,aLng,pa,pCfg,sTok&aLng=en-gb,xx-xx")
    Object b(@rhl("Authorization") String str, @rhl("Referer") String str2, @dxz("outletAuthKey") String str3, @dxz("streamUuid") String str4, v1b<? super PerformStreamResp> v1bVar);
}
