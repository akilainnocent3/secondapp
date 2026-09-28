package defpackage;

import com.sportybet.feature.dedicatedteampage.shared.data.model.ImageDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.FeedDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.ThumbnailDto;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class rlc implements otk0 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ rlc b = new rlc();

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    public static final boolean a(Selection selection, Selection selection2) {
        boolean z;
        boolean z2;
        if (selection != null) {
            Market market = selection.b;
            if (selection2 != null) {
                Market market2 = selection2.b;
                if (Intrinsics.g(selection.a, selection2.a) && b(selection) && b(selection2)) {
                    String str = market.specifier;
                    slc slcVar = slc.a;
                    slcVar.getClass();
                    String str2 = slc.c;
                    if (akf.h(str, str2)) {
                        String str3 = market2.specifier;
                        slcVar.getClass();
                        if (akf.h(str3, str2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    String str4 = market.specifier;
                    slcVar.getClass();
                    String str5 = slc.e;
                    if (akf.h(str4, str5)) {
                        String str6 = market2.specifier;
                        slcVar.getClass();
                        z2 = akf.h(str6, str5);
                    }
                    if (z || z2) {
                        return Intrinsics.g(selection.c, selection2.c);
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public static final boolean b(Selection selection) {
        if (selection == null) {
            return false;
        }
        Market market = selection.b;
        if (akf.b(market, tlc.a, true) == null) {
            return false;
        }
        return f(market.id, market.specifier);
    }

    public static final boolean c(Selection selection) {
        if (selection == null) {
            return false;
        }
        Outcome outcome = selection.c;
        return Intrinsics.g(outcome != null ? outcome.id : null, "10");
    }

    public static final boolean d(Selection selection) {
        if (selection == null) {
            return false;
        }
        Market market = selection.b;
        if (akf.b(market, tlc.a, true) == null) {
            return false;
        }
        String str = market.id;
        slc.a.getClass();
        return Intrinsics.g(str, slc.d) && akf.h(market.specifier, slc.e);
    }

    public static final boolean e(Selection selection) {
        Market market;
        EarlyPayoutMarket earlyPayoutMarketB;
        return (selection == null || selection.q() || (market = selection.b) == null || (earlyPayoutMarketB = akf.b(market, tlc.a, true)) == null || !earlyPayoutMarketB.getSupported() || !f(market.id, market.specifier)) ? false : true;
    }

    public static final boolean f(String str, String str2) {
        slc slcVar = slc.a;
        slcVar.getClass();
        if (Intrinsics.g(str, slc.b)) {
            slcVar.getClass();
            if (akf.h(str2, slc.c)) {
                return true;
            }
        }
        slcVar.getClass();
        if (!Intrinsics.g(str, slc.d)) {
            return false;
        }
        slcVar.getClass();
        return akf.h(str2, slc.e);
    }

    public static final Selection g(Selection selection) {
        selection.getClass();
        if (!e(selection)) {
            return null;
        }
        Selection selectionS = g880.s(selection);
        Market market = selectionS.b;
        slc slcVar = slc.a;
        slcVar.getClass();
        market.id = slc.d;
        slcVar.getClass();
        market.specifier = slc.e;
        return selectionS;
    }

    public static final Selection h(Selection selection) {
        selection.getClass();
        if (!b(selection)) {
            return null;
        }
        Selection selectionS = g880.s(selection);
        Market market = selectionS.b;
        slc slcVar = slc.a;
        slcVar.getClass();
        market.id = slc.b;
        slcVar.getClass();
        market.specifier = slc.c;
        return selectionS;
    }

    public static final wgh i(FeedDto feedDto) {
        String url;
        ThumbnailDto thumbnailDto;
        ImageDto imageDto;
        feedDto.getClass();
        List<ImageDto> images = feedDto.getImages();
        if (images == null || (imageDto = (ImageDto) CollectionsKt.firstOrNull(images)) == null || (url = imageDto.getUrl()) == null) {
            List<ThumbnailDto> thumbnails = feedDto.getThumbnails();
            url = (thumbnails == null || (thumbnailDto = (ThumbnailDto) CollectionsKt.firstOrNull(thumbnails)) == null) ? null : thumbnailDto.getUrl();
        }
        String str = url;
        String id = feedDto.getId();
        String headline = feedDto.getHeadline();
        if (headline == null) {
            headline = "";
        }
        if (StringsKt.U(headline) && (headline = feedDto.getTitle()) == null) {
            headline = "";
        }
        String str2 = headline;
        String description = feedDto.getDescription();
        return new wgh(id, str2, description == null ? "" : description, str, feedDto.getPublishedTime());
    }

    @Override // defpackage.otk0
    public Object zza() {
        return new Boolean(((ypl0) xpl0.b.a.a).zza());
    }
}
