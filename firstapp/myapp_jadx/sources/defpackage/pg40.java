package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.bookingcode.presentation.activity.PreviewCodeActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Share;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class pg40 {
    public final t090 a;

    public pg40(t090 t090Var) {
        t090Var.getClass();
        this.a = t090Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(Context context, BookingData bookingData, wae waeVar, zha0 zha0Var, x1b x1bVar) {
        og40 og40Var;
        Context context2;
        wae waeVar2;
        Object obj;
        ArrayList arrayList;
        BookingData bookingData2 = bookingData;
        zha0 zha0Var2 = zha0Var;
        if (x1bVar instanceof og40) {
            og40Var = (og40) x1bVar;
            int i = og40Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                og40Var.v = i - Integer.MIN_VALUE;
            } else {
                og40Var = new og40(this, x1bVar);
            }
        } else {
            og40Var = new og40(this, x1bVar);
        }
        Object obj2 = og40Var.f;
        y5b y5bVar = y5b.a;
        int i2 = og40Var.v;
        if (i2 == 0) {
            uj50.b(obj2);
            List<Event> list = bookingData2.outcomes;
            if (list == null) {
                return Unit.a;
            }
            LinkedHashMap linkedHashMapA = apg.a(list);
            ArrayList arrayList2 = new ArrayList(iu2.d());
            iu2.b();
            for (Event event : list) {
                if (event.markets != null && !event.isBetBuilderChild()) {
                    for (Market market : event.markets) {
                        List<Outcome> list2 = market.outcomes;
                        if (list2 != null && market.status != 3) {
                            Iterator<Outcome> it = list2.iterator();
                            while (it.hasNext()) {
                                iu2.t(event, market, it.next(), true, false, (List) linkedHashMapA.get(market.id), 16336);
                            }
                        }
                    }
                }
            }
            List listA0 = CollectionsKt.A0(iu2.d());
            if (zha0Var2 != null) {
                zha0Var2.c = Boolean.valueOf(iu2.a.j().t());
            }
            iu2.b();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                Selection selection = (Selection) obj3;
                iu2.t(selection.a, selection.b, selection.c, true, false, selection.d, 16336);
            }
            g93.b(new Share(bookingData2.shareCode, bookingData2.shareURL));
            String str = zha0Var2 != null ? zha0Var2.d : null;
            String str2 = bookingData2.shareCode;
            if (str2 == null) {
                str2 = "";
            }
            b190 b190Var = new b190(listA0, null, str, str2);
            context2 = context;
            og40Var.a = context2;
            og40Var.b = bookingData2;
            waeVar2 = waeVar;
            og40Var.c = waeVar2;
            og40Var.d = zha0Var2;
            og40Var.e = arrayList2;
            og40Var.v = 1;
            Object objA = this.a.a(b190Var, og40Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = og40Var.e;
            zha0 zha0Var3 = og40Var.d;
            wae waeVar3 = og40Var.c;
            BookingData bookingData3 = og40Var.b;
            Context context3 = og40Var.a;
            uj50.b(obj2);
            obj = obj2;
            context2 = context3;
            waeVar2 = waeVar3;
            zha0Var2 = zha0Var3;
            bookingData2 = bookingData3;
        }
        c190 c190Var = (c190) obj;
        String str3 = c190Var.a;
        String str4 = c190Var.b;
        wae waeVar4 = wae.SHARE;
        if (waeVar2 == waeVar4) {
            String strA = o7d.a(waeVar4);
            String str5 = bookingData2.shareURL;
            String str6 = bookingData2.shareCode;
            String strA2 = zha0Var2 != null ? zha0Var2.a() : null;
            boolean zX = g880.x(arrayList);
            StringBuilder sbA = crh0.a(strA, "?imageUri=", str3, "&imageWithUserUri=", str4);
            hxa.c(sbA, "&linkUrl=", str5, "&shareCode=", str6);
            sh8.c().e(x9d.a(strA2, "&isSingleBetBuilder=", "&source=load_code_page_last_loaded_code", sbA, zX));
        } else if (waeVar2 == wae.PREVIEW) {
            try {
                String strDecode = URLDecoder.decode(str3, StandardCharsets.UTF_8.name());
                Intent intent = new Intent(context2, (Class<?>) PreviewCodeActivity.class);
                intent.putExtra("imageUri", strDecode);
                intent.putExtra("shareCode", bookingData2.shareCode);
                yrh0.s(context2, intent, true);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IllegalCharsetNameException e2) {
                e2.printStackTrace();
            }
        }
        return Unit.a;
    }
}
