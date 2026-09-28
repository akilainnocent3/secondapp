package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.realsports.OddsFilterEventCountData;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.multimaker.data.dto.MultiMakerEventDto;
import com.sportybet.android.multimaker.data.dto.MultiMakerLeagueOptionsResponse;
import com.sportybet.android.multimaker.data.dto.MultiMakerRequest;
import com.sportybet.android.multimaker.data.dto.MultiMakerSportDto;
import com.sportybet.plugin.realsports.data.BetBuilderMarket;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturedResponse;
import com.sportybet.plugin.realsports.data.FirstSearchResult;
import com.sportybet.plugin.realsports.data.HotKeywordData;
import com.sportybet.plugin.realsports.data.LiveStreamResponse;
import com.sportybet.plugin.realsports.data.MapArrayData;
import com.sportybet.plugin.realsports.data.MixHighlight;
import com.sportybet.plugin.realsports.data.MyFavoriteLeague;
import com.sportybet.plugin.realsports.data.MyFavoriteMarket;
import com.sportybet.plugin.realsports.data.MyFavoriteSport;
import com.sportybet.plugin.realsports.data.MyFavoriteTeam;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OutrightEvent;
import com.sportybet.plugin.realsports.data.PopularAndSportData;
import com.sportybet.plugin.realsports.data.PostSearchTeam;
import com.sportybet.plugin.realsports.data.PostSportId;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.QuickMarketItem;
import com.sportybet.plugin.realsports.data.Results;
import com.sportybet.plugin.realsports.data.Schedule;
import com.sportybet.plugin.realsports.data.SearchData;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportExtension;
import com.sportybet.plugin.realsports.data.SportGroup;
import com.sportybet.plugin.realsports.data.TimeFilterEventCountData;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.data.radio.RadioStreamData;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupData;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00060\u00162\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJ<\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00100\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001e\u0010\u001fJe\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00100\u00060\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u0004H'¢\u0006\u0004\b\"\u0010#JX\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u0004H§@¢\u0006\u0004\b'\u0010(JN\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010)\u001a\u00020\u00042\b\b\u0001\u0010*\u001a\u00020\u00042\u0010\b\u0001\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H§@¢\u0006\u0004\b,\u0010-J@\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010)\u001a\u00020\u00042\b\b\u0001\u0010*\u001a\u00020\u0004H§@¢\u0006\u0004\b0\u00101J-\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00100\u00060\u00162\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b4\u00105J(\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00100\u00062\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b6\u0010\u0013J-\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00100\u00060\u00162\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b7\u00105J(\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00100\u00062\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b8\u0010\u0013JA\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00100\u00060\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010:\u001a\u0002092\b\b\u0001\u0010 \u001a\u000209H'¢\u0006\u0004\b<\u0010=J4\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00100\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b>\u0010\u001aJ\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0006H§@¢\u0006\u0004\b@\u0010AJA\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00100\u00060\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010$\u001a\u00020B2\b\b\u0001\u0010%\u001a\u00020BH'¢\u0006\u0004\bC\u0010DJk\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00060\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010$\u001a\u00020B2\b\b\u0001\u0010%\u001a\u00020B2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bI\u0010JJ&\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00060K2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bM\u0010\u0013J \u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bO\u0010\u0013J*\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00062\b\b\u0001\u0010)\u001a\u00020\u00042\b\b\u0001\u0010*\u001a\u00020\u0004H§@¢\u0006\u0004\bQ\u0010RJ<\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010)\u001a\u00020\u00042\b\b\u0001\u0010*\u001a\u00020\u0004H§@¢\u0006\u0004\bS\u0010TJ7\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00100\u00060\u00162\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bW\u0010XJ9\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\u00100\u00060Z2\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\\\u0010]J(\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b_\u0010\u0013J!\u0010a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0\u00100\u00060\u0016H'¢\u0006\u0004\ba\u0010bJ!\u0010d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0\u00100\u00060\u0016H'¢\u0006\u0004\bd\u0010bJ-\u0010h\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0\u00100\u00060\u00162\n\b\u0001\u0010f\u001a\u0004\u0018\u00010eH'¢\u0006\u0004\bh\u0010iJ-\u0010j\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0\u00100\u00060\u00162\n\b\u0001\u0010f\u001a\u0004\u0018\u00010eH'¢\u0006\u0004\bj\u0010iJ-\u0010m\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\u00100\u00060\u00162\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bm\u00105J-\u0010o\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\u00100\u00060\u00162\n\b\u0001\u0010^\u001a\u0004\u0018\u00010nH'¢\u0006\u0004\bo\u0010pJ-\u0010r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\u00100\u00060\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\br\u00105J'\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0\u00060\u00162\n\b\u0001\u0010s\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bu\u00105J'\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0\u00060\u00162\n\b\u0001\u0010s\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bv\u00105J'\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00060\u00162\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bw\u00105Jo\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020~\u0018\u00010\u00062\b\b\u0001\u0010x\u001a\u00020\u00022\n\b\u0001\u0010y\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010z\u001a\u00020\n2\b\b\u0003\u0010{\u001a\u00020\n2\n\b\u0001\u0010|\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010}\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010)\u001a\u00020\u00042\b\b\u0003\u0010*\u001a\u00020\u0004H§@¢\u0006\u0005\b\u007f\u0010\u0080\u0001JN\u0010\u0082\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0001\u0018\u00010\u00062\b\b\u0001\u0010x\u001a\u00020\u00022\b\b\u0003\u0010z\u001a\u00020\n2\b\b\u0003\u0010{\u001a\u00020\n2\b\b\u0003\u0010)\u001a\u00020\u00042\b\b\u0003\u0010*\u001a\u00020\u0004H§@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J!\u0010\u0085\u0001\u001a\u0011\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010\u0010\u0018\u00010\u0006H§@¢\u0006\u0005\b\u0085\u0001\u0010AJg\u0010\u0086\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0010\u0018\u00010\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u0004H§@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JL\u0010\u0089\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0010\u0018\u00010\u00062\t\b\u0001\u0010\u0088\u0001\u001a\u00020\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u0002H§@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001JC\u0010\u008b\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0010\u0018\u00010\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001JE\u0010\u008d\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0010\u0018\u00010\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001J*\u0010\u008e\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0010\u0018\u00010\u00062\b\b\u0001\u00102\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008e\u0001\u0010\u0013J!\u0010\u0090\u0001\u001a\u0011\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008f\u00010\u0010\u0018\u00010\u0006H§@¢\u0006\u0005\b\u0090\u0001\u0010AJ7\u0010\u0092\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010\u00100\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\b\u0092\u0001\u0010\u001aJF\u0010\u0094\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0010\u0018\u00010\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J6\u0010\u0098\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0097\u00010\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00022\u000b\b\u0001\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\b\u0098\u0001\u0010\u001aJQ\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020&0\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\"\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020t0\u00062\b\b\u0001\u00102\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009b\u0001\u0010\u0013J\"\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020t0\u00062\b\b\u0001\u00102\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009c\u0001\u0010\u0013J#\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u00062\b\b\u0001\u00102\u001a\u00020\u0002H§@¢\u0006\u0005\b\u009e\u0001\u0010\u0013J#\u0010 \u0001\u001a\t\u0012\u0005\u0012\u00030\u009f\u00010\u00062\b\b\u0001\u00102\u001a\u00020\u0002H§@¢\u0006\u0005\b \u0001\u0010\u0013J,\u0010¤\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030£\u00010\u00100\u00062\n\b\u0001\u0010¢\u0001\u001a\u00030¡\u0001H§@¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001f\u0010§\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¦\u00010\u00100\u0006H§@¢\u0006\u0005\b§\u0001\u0010AJF\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010B2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010BH§@¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001e\u0010«\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u0006H§@¢\u0006\u0005\b«\u0001\u0010AJP\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020t0\u00062\b\b\u0001\u0010E\u001a\u00020\u00022\u000b\b\u0001\u0010¬\u0001\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0093\u0001\u001a\u00020\u00022\b\b\u0001\u0010{\u001a\u00020\n2\t\b\u0001\u0010\u00ad\u0001\u001a\u00020\nH§@¢\u0006\u0006\b®\u0001\u0010¯\u0001¨\u0006°\u0001À\u0006\u0003"}, d2 = {"Lz7h;", "", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "hideOutcomes", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/plugin/realsports/data/Event;", "r", "(Ljava/lang/String;Ljava/lang/Boolean;Lv1b;)Ljava/lang/Object;", "", "productId", "source", "m", "(ILjava/lang/String;ILv1b;)Ljava/lang/Object;", "sportId", "", "Lcom/sportybet/plugin/realsports/data/BetBuilderMarket;", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "sourceScenario", "selectionJson", "Lsu5;", "K", "(Ljava/lang/String;Ljava/lang/String;)Lsu5;", "x", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "option", "todayGames", "Lcom/sportybet/plugin/realsports/data/Sport;", "z", "(ILjava/lang/String;ZLv1b;)Ljava/lang/Object;", "timeline", "categoryId", "f0", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lsu5;", "startTime", "endTime", "Lcom/sportybet/plugin/realsports/data/SportGroup;", "i", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLv1b;)Ljava/lang/Object;", "withOneUpMarket", "withTwoUpMarket", "filterMarketIds", "d0", "(Ljava/lang/String;ZZLjava/util/List;Lv1b;)Ljava/lang/Object;", "userId", "Lcom/sportybet/plugin/realsports/data/MapArrayData;", "D", "(Ljava/lang/String;Ljava/lang/String;ZZLv1b;)Ljava/lang/Object;", "sportsJson", "Lcom/sportybet/plugin/realsports/data/Tournament;", "b0", "(Ljava/lang/String;)Lsu5;", "n", "u", "w", "", "startTimeline", "Lcom/sportybet/plugin/realsports/data/Schedule;", "N", "(Ljava/lang/String;FF)Lsu5;", "Y", "Lcom/sportybet/plugin/realsports/data/PopularAndSportData;", "v", "(Lv1b;)Ljava/lang/Object;", "", "t", "(Ljava/lang/String;JJ)Lsu5;", "tournamentId", "lastId", "count", "Lcom/sportybet/plugin/realsports/data/Results;", "p", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lsu5;", "Lbi50;", "Lcom/sportybet/plugin/realsports/data/LiveStreamResponse;", "h", "Lcom/sportybet/plugin/realsports/data/radio/RadioStreamData;", "S", "Lcom/sportybet/plugin/realsports/data/MixHighlight;", "s", "(ZZLv1b;)Ljava/lang/Object;", "H", "(Ljava/lang/String;ZZLv1b;)Ljava/lang/Object;", "countryCode", "Lcom/sportybet/plugin/realsports/data/OrderedSportItem;", "F", "(ILjava/lang/String;)Lsu5;", "blockCode", "Lct90;", "Lcom/sportybet/plugin/realsports/data/QuickMarketItem;", "J", "(Ljava/lang/String;Ljava/lang/String;)Lct90;", "data", "M", "Lcom/sportybet/plugin/realsports/data/SportExtension;", "o", "()Lsu5;", "Lcom/sportybet/plugin/realsports/data/MyFavoriteSport;", "E", "Lcom/sportybet/plugin/realsports/data/PostSportId;", AnalyticsParam.EVENT_PARAM_ID, "Lcom/sportybet/plugin/realsports/data/MyFavoriteLeague;", "A", "(Lcom/sportybet/plugin/realsports/data/PostSportId;)Lsu5;", "Q", "leagueId", "Lcom/sportybet/plugin/realsports/data/MyFavoriteTeam;", "W", "Lcom/sportybet/plugin/realsports/data/PostSearchTeam;", "j", "(Lcom/sportybet/plugin/realsports/data/PostSearchTeam;)Lsu5;", "Lcom/sportybet/plugin/realsports/data/MyFavoriteMarket;", "P", "favoriteData", "Lcom/sportybet/plugin/realsports/data/PreMatchSportsData;", "g", "e0", "l", "keyword", "sport", "offset", "pageSize", "keywordType", "prodId", "Lcom/sportybet/plugin/realsports/data/SearchData;", "y", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;ZZLv1b;)Ljava/lang/Object;", "Lcom/sportybet/plugin/realsports/data/FirstSearchResult;", "R", "(Ljava/lang/String;IIZZLv1b;)Ljava/lang/Object;", "Lcom/sportybet/plugin/realsports/data/HotKeywordData;", "c", "q", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLv1b;)Ljava/lang/Object;", "isBooked", "c0", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "U", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lv1b;)Ljava/lang/Object;", "B", "d", "Lcom/sportybet/plugin/realsports/data/FeaturedResponse;", "e", "Lcom/sportybet/plugin/realsports/quickmarket/data/MarketGroupData;", "a0", "marketId", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "tournamentIds", "Lcom/sportybet/plugin/realsports/data/OutrightEvent;", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "f", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "G", "V", "Lcom/sporty/android/core/model/realsports/OddsFilterEventCountData;", "I", "Lcom/sportybet/plugin/realsports/data/TimeFilterEventCountData;", "O", "Lcom/sportybet/android/multimaker/data/dto/MultiMakerRequest;", "request", "Lcom/sportybet/android/multimaker/data/dto/MultiMakerEventDto;", "Z", "(Lcom/sportybet/android/multimaker/data/dto/MultiMakerRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/multimaker/data/dto/MultiMakerSportDto;", "T", "Lcom/sportybet/android/multimaker/data/dto/MultiMakerLeagueOptionsResponse;", "C", "(Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;Lv1b;)Ljava/lang/Object;", "k", "teamId", "pageNum", "L", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public interface z7h {
    @flz("factsCenter/preferences/leagues")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<List<MyFavoriteLeague>>> A(@jh4 PostSportId id);

    @sbj("factsCenter/wapConfigurableUpcomingEvents")
    Object B(@db30("sportId") String str, @db30("withOneUpMarket") Boolean bool, @db30("withTwoUpMarket") Boolean bool2, v1b<? super BaseResponse<List<Event>>> v1bVar);

    @sbj("factsCenter/multiMaker/options")
    Object C(@db30("sportId") String str, @db30("productId") int i, @db30("startTime") Long l, @db30("endTime") Long l2, v1b<? super BaseResponse<MultiMakerLeagueOptionsResponse>> v1bVar);

    @sbj("factsCenter/v2/wapConfigurableNewHighlightEvents")
    Object D(@db30("sportId") String str, @db30("userId") String str2, @db30("withOneUpMarket") boolean z, @db30("withTwoUpMarket") boolean z2, v1b<? super BaseResponse<MapArrayData>> v1bVar);

    @sbj("factsCenter/preferences/sports")
    su5<BaseResponse<List<MyFavoriteSport>>> E();

    @sbj("factsCenter/orderedSportList")
    su5<BaseResponse<List<OrderedSportItem>>> F(@db30("productId") int productId, @db30("countryCode") String countryCode);

    @flz("factsCenter/wapConfigurableEventsByOrder")
    @gil({"Content-Type: application/json"})
    Object G(@jh4 String str, v1b<? super BaseResponse<PreMatchSportsData>> v1bVar);

    @sbj("factsCenter/configurableCustomEvents")
    Object H(@db30("userId") String str, @db30("withOneUpMarket") boolean z, @db30("withTwoUpMarket") boolean z2, v1b<? super BaseResponse<List<Event>>> v1bVar);

    @flz("factsCenter/oddsFilteredEvents/count")
    @gil({"Content-Type: application/json"})
    Object I(@jh4 String str, v1b<? super BaseResponse<OddsFilterEventCountData>> v1bVar);

    @sbj("factsCenter/quickMarketList")
    ct90<BaseResponse<List<QuickMarketItem>>> J(@db30("block") String blockCode, @db30("sport") String sportId);

    @flz("factsCenter/Outcomes")
    @gil({"Content-Type: application/json"})
    @fae
    su5<BaseResponse<List<Event>>> K(@rhl("SourceScenario") String sourceScenario, @jh4 String selectionJson);

    @sbj("factsCenter/tournament/{tournamentId}/events")
    Object L(@dxz("tournamentId") String str, @db30("teamId") String str2, @db30("marketId") String str3, @db30("pageSize") int i, @db30("pageNum") int i2, v1b<? super BaseResponse<PreMatchSportsData>> v1bVar);

    @flz("factsCenter/recommendation")
    @gil({"Content-Type: application/json"})
    Object M(@jh4 String str, v1b<? super BaseResponse<List<Event>>> v1bVar);

    @sbj("factsCenter/schedule")
    su5<BaseResponse<List<Schedule>>> N(@db30("sportId") String sportId, @db30("startTimeline") float startTimeline, @db30("timeline") float timeline);

    @flz("factsCenter/wapConfigurableEventsByOrder/count")
    @gil({"Content-Type: application/json"})
    Object O(@jh4 String str, v1b<? super BaseResponse<TimeFilterEventCountData>> v1bVar);

    @sbj("factsCenter/preferences/sports/{sportId}/markets")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<List<MyFavoriteMarket>>> P(@dxz("sportId") String sportId);

    @flz("factsCenter/preferences/leagues?topLeague=true")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<List<MyFavoriteLeague>>> Q(@jh4 PostSportId id);

    @sbj("factsCenter/event/firstSearch")
    Object R(@db30("keyword") String str, @db30("offset") int i, @db30("pageSize") int i2, @db30("withOneUpMarket") boolean z, @db30("withTwoUpMarket") boolean z2, v1b<? super BaseResponse<FirstSearchResult>> v1bVar);

    @sbj("factsCenter/audioLiveChannel/getLiveStreamData")
    Object S(@db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str, v1b<? super BaseResponse<RadioStreamData>> v1bVar);

    @sbj("factsCenter/multiMaker/sports")
    Object T(v1b<? super BaseResponse<List<MultiMakerSportDto>>> v1bVar);

    @sbj("factsCenter/configurableLiveOrPrematchEvents")
    Object U(@db30("sportId") String str, @db30("withOneUpMarket") Boolean bool, @db30("withTwoUpMarket") Boolean bool2, v1b<? super BaseResponse<List<Tournament>>> v1bVar);

    @flz("factsCenter/oddsFilteredEvents")
    @gil({"Content-Type: application/json"})
    Object V(@jh4 String str, v1b<? super BaseResponse<PreMatchSportsData>> v1bVar);

    @sbj("factsCenter/preferences/leagues/{leagueId}/teams")
    su5<BaseResponse<List<MyFavoriteTeam>>> W(@dxz("leagueId") String leagueId);

    @sbj("factsCenter/outrightEvents/sports/{sportId}/{tournamentIds}")
    @gil({"Content-Type: application/json"})
    Object X(@dxz("sportId") String str, @dxz("tournamentIds") String str2, v1b<? super BaseResponse<List<OutrightEvent>>> v1bVar);

    @sbj("factsCenter/commonThumbnailEvents")
    Object Y(@db30("sportId") String str, @db30("productId") String str2, v1b<? super BaseResponse<List<Tournament>>> v1bVar);

    @flz("factsCenter/multiMaker")
    @gil({"Content-Type: application/json"})
    Object Z(@jh4 MultiMakerRequest multiMakerRequest, v1b<? super BaseResponse<List<MultiMakerEventDto>>> v1bVar);

    @sbj("factsCenter/betBuilder/markets/v2")
    Object a(@db30("sportId") String str, v1b<? super BaseResponse<List<BetBuilderMarket>>> v1bVar);

    @sbj("factsCenter/marketGroups/menu?")
    Object a0(@db30("sportId") String str, @db30("productId") String str2, v1b<? super BaseResponse<List<MarketGroupData>>> v1bVar);

    @sbj("factsCenter/byAdditionalQuickMarket?")
    Object b(@db30("sportId") String str, @db30("productId") String str2, @db30("marketId") String str3, v1b<? super BaseResponse<List<Tournament>>> v1bVar);

    @flz("factsCenter/wapEvents")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<List<Tournament>>> b0(@jh4 String sportsJson);

    @sbj("factsCenter/event/searchingKeyWords")
    Object c(v1b<? super BaseResponse<List<HotKeywordData>>> v1bVar);

    @sbj("factsCenter/sportList")
    Object c0(@db30("isBooked") boolean z, @db30("sportId") String str, @db30("productId") String str2, @db30("option") String str3, v1b<? super BaseResponse<List<Sport>>> v1bVar);

    @flz("factsCenter/wapEvents")
    @gil({"Content-Type: application/json"})
    Object d(@jh4 String str, v1b<? super BaseResponse<List<Tournament>>> v1bVar);

    @sbj("factsCenter/wapConfigurableIndexLiveEvents")
    Object d0(@db30("sportId") String str, @db30("withOneUpMarket") boolean z, @db30("withTwoUpMarket") boolean z2, @db30("filterMarketIds") List<String> list, v1b<? super BaseResponse<List<Event>>> v1bVar);

    @sbj("factsCenter/recommendScrollEvents/v2")
    Object e(v1b<? super BaseResponse<List<FeaturedResponse>>> v1bVar);

    @flz("factsCenter/preferences/events")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<PreMatchSportsData>> e0(@jh4 String favoriteData);

    @sbj("factsCenter/wapPopularAndSportOption/v2")
    Object f(@db30("sportId") String str, @db30("productId") int i, @db30("startTime") String str2, @db30("endTime") String str3, @db30("timeline") String str4, v1b<? super BaseResponse<SportGroup>> v1bVar);

    @sbj("factsCenter/sportList")
    @fae
    su5<BaseResponse<List<Sport>>> f0(@db30("sportId") String sportId, @db30("productId") int productId, @db30("timeline") String timeline, @db30("option") String option, @db30("categoryId") String categoryId, @db30("todayGames") boolean todayGames);

    @flz("factsCenter/preferences/events")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<PreMatchSportsData>> g(@jh4 String favoriteData);

    @sbj("factsCenter/liveChannel/getLiveStreamData")
    Object h(@db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str, v1b<? super bi50<BaseResponse<LiveStreamResponse>>> v1bVar);

    @sbj("factsCenter/wapPopularAndSportOption")
    Object i(@db30("sportId") String str, @db30("productId") int i, @db30("startTime") String str2, @db30("endTime") String str3, @db30("timeline") String str4, @db30("todayGames") boolean z, v1b<? super BaseResponse<SportGroup>> v1bVar);

    @flz("factsCenter/preferences/teams")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<List<MyFavoriteTeam>>> j(@jh4 PostSearchTeam data);

    @sbj("factsCenter/banned/events")
    Object k(v1b<? super BaseResponse<List<String>>> v1bVar);

    @flz("factsCenter/preferences/events/categorySummary")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<SportGroup>> l(@jh4 String data);

    @sbj("factsCenter/event")
    Object m(@db30("productId") int i, @db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str, @db30("source") int i2, v1b<? super BaseResponse<Event>> v1bVar);

    @flz("factsCenter/wapConfigurableEvents")
    @gil({"Content-Type: application/json"})
    Object n(@jh4 String str, v1b<? super BaseResponse<List<Tournament>>> v1bVar);

    @sbj("factsCenter/sportExtension")
    su5<BaseResponse<List<SportExtension>>> o();

    @sbj("factsCenter/eventResultList")
    su5<BaseResponse<Results>> p(@db30("sportId") String sportId, @db30("startTime") long startTime, @db30("endTime") long endTime, @db30("categoryId") String categoryId, @db30("tournamentId") String tournamentId, @db30("lastId") String lastId, @db30("count") String count);

    @sbj("factsCenter/sportList")
    Object q(@db30("sportId") String str, @db30("productId") Integer num, @db30("timeline") String str2, @db30("option") String str3, @db30("categoryId") String str4, @db30("todayGames") boolean z, v1b<? super BaseResponse<List<Sport>>> v1bVar);

    @sbj("factsCenter/event")
    Object r(@db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str, @db30("hideOutcomes") Boolean bool, v1b<? super BaseResponse<Event>> v1bVar);

    @sbj("factsCenter/wapConfigurableMixHighlightEvents")
    Object s(@db30("withOneUpMarket") boolean z, @db30("withTwoUpMarket") boolean z2, v1b<? super BaseResponse<MixHighlight>> v1bVar);

    @sbj("factsCenter/sportResultOption")
    su5<BaseResponse<List<Sport>>> t(@db30("sportId") String sportId, @db30("startTime") long startTime, @db30("endTime") long endTime);

    @flz("factsCenter/wapChosenEvents")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<List<Tournament>>> u(@jh4 String sportsJson);

    @sbj("factsCenter/popularAndSportList")
    Object v(v1b<? super BaseResponse<PopularAndSportData>> v1bVar);

    @flz("factsCenter/wapConfigurableChosenEvents")
    @gil({"Content-Type: application/json"})
    Object w(@jh4 String str, v1b<? super BaseResponse<List<Tournament>>> v1bVar);

    @flz("factsCenter/Outcomes")
    @gil({"Content-Type: application/json"})
    Object x(@rhl("SourceScenario") String str, @jh4 String str2, v1b<? super BaseResponse<List<Event>>> v1bVar);

    @sbj("factsCenter/event/search")
    Object y(@db30("keyword") String str, @db30("sport") String str2, @db30("offset") int i, @db30("pageSize") int i2, @db30("keywordType") Integer num, @db30("productId") Integer num2, @db30("withOneUpMarket") boolean z, @db30("withTwoUpMarket") boolean z2, v1b<? super BaseResponse<SearchData>> v1bVar);

    @sbj("factsCenter/sportList")
    Object z(@db30("productId") int i, @db30("option") String str, @db30("todayGames") boolean z, v1b<? super BaseResponse<List<Sport>>> v1bVar);
}
