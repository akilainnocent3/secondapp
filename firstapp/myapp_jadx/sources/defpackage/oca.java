package defpackage;

import android.content.Context;
import com.sportygames.fbg_dialog.data.model.GiftItem;
import com.sportygames.newcms.CMSRes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fbg_dialog.presentation.component.ComposeFBGDialogKt$ComposeFBGDialogData$1$1", f = "ComposeFBGDialog.kt", l = {}, m = "invokeSuspend", v = 1)
public final class oca extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ e5h a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ double d;
    public final /* synthetic */ double e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ ytw<Boolean> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oca(e5h e5hVar, Context context, ArrayList arrayList, double d, double d2, Function0 function0, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = e5hVar;
        this.b = context;
        this.c = arrayList;
        this.d = d;
        this.e = d2;
        this.f = function0;
        this.i = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oca(this.a, this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oca) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Boolean bool = Boolean.TRUE;
        ytw<Boolean> ytwVar = this.i;
        ytwVar.setValue(bool);
        e5h e5hVar = this.a;
        e5hVar.getClass();
        this.b.getClass();
        h5h h5hVar = e5hVar.c;
        h5hVar.getClass();
        double d = this.d;
        double d2 = this.e;
        double d3 = (0.0d > d || 0.0d < d2) ? d : 0.0d;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            GiftItem giftItem = (GiftItem) arrayList.get(i2);
            String currency = giftItem.getCurrency();
            Locale locale = Locale.ROOT;
            String upperCase = currency.toUpperCase(locale);
            upperCase.getClass();
            if (h5hVar.h.length() == 0) {
                CMSRes cMSResD = h5h.d(giftItem.getCurrency());
                String strC = cMSResD != null ? h5hVar.c(cMSResD, giftItem.getCurrency(), new String[i]) : giftItem.getCurrency();
                h5hVar.h = strC;
                String upperCase2 = strC.toUpperCase(locale);
                upperCase2.getClass();
                h5hVar.h = upperCase2;
            } else {
                d3 = d3;
            }
            h5hVar.b(Double.valueOf(giftItem.getCurBal()));
            String strC2 = giftItem.getCurBal() == giftItem.getInitBal() ? "" : h5hVar.c(r4h.s.d, "Original Amount: {currency} {amount}", h5hVar.h, h5hVar.b(Double.valueOf(giftItem.getInitBal())));
            double curBal = d3 > giftItem.getCurBal() ? giftItem.getCurBal() : d3;
            h5hVar.b(Double.valueOf(curBal));
            r4h r4hVar = r4h.s;
            String str = strC2;
            h5hVar.i = h5hVar.c(r4hVar.e, "MAX", new String[i]);
            h5hVar.f = h5hVar.c(r4hVar.f, "LEFT", new String[i]);
            h5hVar.g = h5hVar.c(r4hVar.g, "OFF", new String[i]);
            String str2 = h5hVar.h;
            double curBal2 = giftItem.getCurBal();
            str2.getClass();
            String str3 = String.format("%s %s", Arrays.copyOf(new Object[]{str2, h5hVar.b(Double.valueOf(curBal2))}, 2));
            long expireTime = giftItem.getExpireTime();
            HashMap map = new HashMap();
            int i4 = size;
            ArrayList arrayList3 = arrayList;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            String str4 = simpleDateFormat.format(new Date(expireTime));
            str4.getClass();
            map.put("{date}", str4);
            String strC3 = h5hVar.c(r4hVar.k, "Expires  %1$s", str4);
            String str5 = String.format("%1$s", Arrays.copyOf(new Object[]{h5hVar.b(Double.valueOf(giftItem.getCurBal()))}, 1));
            boolean z = giftItem.getCurBal() > d3;
            boolean z2 = giftItem.getCurBal() < d2;
            dwk dwkVar = giftItem.getCurBal() > d3 ? dwk.b : dwk.a;
            StringBuilder sb = new StringBuilder(h5hVar.i);
            sb.append(' ');
            String str6 = h5hVar.h;
            str6.getClass();
            sb.append(String.format("%s %s", Arrays.copyOf(new Object[]{str6, h5hVar.b(Double.valueOf(curBal))}, 2)));
            double d4 = d2;
            arrayList2.add(new cok(giftItem, upperCase, str3, str, strC3, str5, dwkVar, z, z2, curBal, sb.toString(), giftItem.getCurBal() > d3 ? dwk.b : dwk.a, d4, giftItem.getCurBal() > d3 ? 1 : 0, giftItem.getCurBal() == giftItem.getInitBal() ? h5hVar.g : h5hVar.f));
            i = 0;
            d2 = d4;
            i2 = i3;
            d3 = d3;
            size = i4;
            arrayList = arrayList3;
        }
        int i5 = i;
        ArrayList arrayList4 = new ArrayList(arrayList2);
        if (!arrayList4.isEmpty()) {
            int size2 = arrayList4.size();
            int i6 = i5;
            while (i6 < size2) {
                Object obj2 = arrayList4.get(i6);
                i6++;
                if (((cok) obj2).i) {
                    ArrayList arrayList5 = new ArrayList();
                    int size3 = arrayList4.size();
                    int i7 = i5;
                    while (i7 < size3) {
                        Object obj3 = arrayList4.get(i7);
                        i7++;
                        if (((cok) obj3).i) {
                            arrayList5.add(obj3);
                        }
                    }
                    p48.A(arrayList4, new g5h());
                    arrayList4.addAll(arrayList5);
                    break;
                }
            }
        }
        ((x5a0) e5hVar.i).setValue(arrayList4);
        ytwVar.setValue(Boolean.FALSE);
        this.f.invoke();
        return Unit.a;
    }
}
