package defpackage;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k1y {
    public final Context a;
    public final Notification.Builder b;
    public final g1y c;
    public final Bundle d;
    public final int e;

    public static class a {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static void b(Notification.Builder builder) {
            builder.setBadgeIconType(0);
        }

        public static void c(Notification.Builder builder, int i) {
            builder.setGroupAlertBehavior(i);
        }

        public static void d(Notification.Builder builder) {
            builder.setSettingsText(null);
        }

        public static void e(Notification.Builder builder) {
            builder.setShortcutId(null);
        }

        public static void f(Notification.Builder builder) {
            builder.setTimeoutAfter(0L);
        }
    }

    public static class b {
        public static void a(Notification.Builder builder, Person person) {
            builder.addPerson(person);
        }

        public static void b(Notification.Action.Builder builder) {
            builder.setSemanticAction(0);
        }
    }

    public static class c {
        public static void a(Notification.Builder builder, boolean z) {
            builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static void b(Notification.Builder builder) {
            builder.setBubbleMetadata(null);
        }

        public static void c(Notification.Action.Builder builder) {
            builder.setContextual(false);
        }
    }

    public static class d {
        public static void a(Notification.Action.Builder builder) {
            builder.setAuthenticationRequired(false);
        }
    }

    public final void a(d1y d1yVar) {
        int i;
        IconCompat iconCompatB = d1yVar.b;
        if (iconCompatB == null && (i = d1yVar.f) != 0) {
            iconCompatB = IconCompat.b(null, "", i);
            d1yVar.b = iconCompatB;
        }
        boolean z = d1yVar.d;
        Bundle bundle = d1yVar.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatB != null ? IconCompat.a.a(iconCompatB, null) : null, d1yVar.g, d1yVar.h);
        p650[] p650VarArr = d1yVar.c;
        if (p650VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[p650VarArr.length];
            for (int i2 = 0; i2 < p650VarArr.length; i2++) {
                p650VarArr[i2].getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    p650.a.a(builderAddExtras);
                }
                remoteInputArr[i2] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            b.b(builder);
        }
        if (i3 >= 29) {
            c.c(builder);
        }
        if (i3 >= 31) {
            d.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", d1yVar.e);
        builder.addExtras(bundle2);
        this.b.addAction(builder.build());
    }

    public k1y(g1y g1yVar) {
        Notification.Builder builder;
        int i;
        Bundle[] bundleArr;
        int i2;
        ArrayList<String> arrayList;
        new ArrayList();
        this.d = new Bundle();
        this.c = g1yVar;
        Context context = g1yVar.a;
        ArrayList<String> arrayList2 = g1yVar.y;
        ArrayList<kh00> arrayList3 = g1yVar.c;
        ArrayList<d1y> arrayList4 = g1yVar.d;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = a.a(context, g1yVar.u);
            this.b = builder;
        } else {
            builder = new Notification.Builder(context);
            this.b = builder;
        }
        Notification notification = g1yVar.w;
        Resources resources = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(g1yVar.e).setContentText(g1yVar.f).setContentInfo(null).setContentIntent(g1yVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(g1yVar.i).setProgress(g1yVar.m, g1yVar.n, false);
        IconCompat iconCompat = g1yVar.h;
        builder.setLargeIcon(iconCompat == null ? null : IconCompat.a.a(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(g1yVar.j);
        j1y j1yVar = g1yVar.l;
        if (j1yVar instanceof h1y) {
            h1y h1yVar = (h1y) j1yVar;
            int color = h1yVar.a.a.getColor(R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) h1yVar.a.a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = h1yVar.a.a;
            PorterDuff.Mode mode = IconCompat.k;
            context2.getClass();
            d1y d1yVarA = new d1y.a(IconCompat.b(context2.getResources(), context2.getPackageName(), R.drawable.ic_call_decline), spannableStringBuilder, null, new Bundle()).a();
            d1yVarA.a.putBoolean("key_action_priority", true);
            ArrayList arrayList5 = new ArrayList(3);
            arrayList5.add(d1yVarA);
            ArrayList<d1y> arrayList6 = h1yVar.a.b;
            if (arrayList6 != null) {
                int size = arrayList6.size();
                int i3 = 0;
                int i4 = 2;
                while (i3 < size) {
                    d1y d1yVar = arrayList6.get(i3);
                    i3++;
                    d1y d1yVar2 = d1yVar;
                    d1yVar2.getClass();
                    if (!d1yVar2.a.getBoolean("key_action_priority") && i4 > 1) {
                        arrayList5.add(d1yVar2);
                        i4--;
                    }
                }
            }
            int size2 = arrayList5.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj = arrayList5.get(i5);
                i5++;
                a((d1y) obj);
            }
        } else {
            ArrayList<d1y> arrayList7 = g1yVar.b;
            int size3 = arrayList7.size();
            int i6 = 0;
            while (i6 < size3) {
                d1y d1yVar3 = arrayList7.get(i6);
                i6++;
                a(d1yVar3);
            }
        }
        Bundle bundle = g1yVar.p;
        if (bundle != null) {
            this.d.putAll(bundle);
        }
        this.b.setShowWhen(g1yVar.k);
        this.b.setLocalOnly(g1yVar.o);
        this.b.setGroup(null);
        this.b.setSortKey(null);
        this.b.setGroupSummary(false);
        this.e = 0;
        this.b.setCategory(null);
        this.b.setColor(g1yVar.q);
        this.b.setVisibility(g1yVar.r);
        this.b.setPublicVersion(null);
        this.b.setSound(notification.sound, notification.audioAttributes);
        String str = "";
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList3.size());
                int size4 = arrayList3.size();
                int i7 = 0;
                while (i7 < size4) {
                    kh00 kh00Var = arrayList3.get(i7);
                    i7++;
                    kh00Var.getClass();
                    arrayList.add("");
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    tx0 tx0Var = new tx0(arrayList2.size() + arrayList.size());
                    tx0Var.addAll(arrayList);
                    tx0Var.addAll(arrayList2);
                    arrayList2 = new ArrayList<>(tx0Var);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size5 = arrayList2.size();
            int i8 = 0;
            while (i8 < size5) {
                String str2 = arrayList2.get(i8);
                i8++;
                this.b.addPerson(str2);
            }
        }
        if (arrayList4.size() > 0) {
            Bundle bundle2 = g1yVar.p;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                g1yVar.p = bundle2;
            }
            Bundle bundle3 = bundle2.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList4.size()) {
                String string = Integer.toString(i9);
                d1y d1yVar4 = arrayList4.get(i9);
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatB = d1yVar4.b;
                ArrayList<d1y> arrayList8 = arrayList4;
                if (iconCompatB == null && (i2 = d1yVar4.f) != 0) {
                    iconCompatB = IconCompat.b(resources, str, i2);
                    d1yVar4.b = iconCompatB;
                }
                Bundle bundle7 = d1yVar4.a;
                bundle6.putInt(AnalyticsParam.HOME_NAV_ICON, iconCompatB != null ? iconCompatB.c() : 0);
                bundle6.putCharSequence("title", d1yVar4.g);
                bundle6.putParcelable("actionIntent", d1yVar4.h);
                Bundle bundle8 = new Bundle(bundle7);
                bundle8.putBoolean("android.support.allowGeneratedReplies", d1yVar4.d);
                bundle6.putBundle("extras", bundle8);
                p650[] p650VarArr = d1yVar4.c;
                if (p650VarArr == null) {
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[p650VarArr.length];
                    int i10 = 0;
                    while (i10 < p650VarArr.length) {
                        p650 p650Var = p650VarArr[i10];
                        int i11 = i10;
                        Bundle bundle9 = new Bundle();
                        p650Var.getClass();
                        bundle9.putString("resultKey", null);
                        bundle9.putCharSequence("label", null);
                        bundle9.putCharSequenceArray(CaxEybC.jZNSuNXlIpLyuC, null);
                        bundle9.putBoolean("allowFreeFormInput", false);
                        bundle9.putBundle("extras", null);
                        bundleArr2[i11] = bundle9;
                        i10 = i11 + 1;
                        p650VarArr = p650VarArr;
                        i9 = i9;
                    }
                    bundleArr = bundleArr2;
                }
                int i12 = i9;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", d1yVar4.e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i9 = i12 + 1;
                arrayList4 = arrayList8;
                str = str;
                resources = null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            Bundle bundle10 = g1yVar.p;
            if (bundle10 == null) {
                bundle10 = new Bundle();
                g1yVar.p = bundle10;
            }
            bundle10.putBundle("android.car.EXTENSIONS", bundle3);
            this.d.putBundle("android.car.EXTENSIONS", bundle4);
        }
        this.b.setExtras(g1yVar.p);
        this.b.setRemoteInputHistory(null);
        RemoteViews remoteViews = g1yVar.s;
        if (remoteViews != null) {
            this.b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = g1yVar.t;
        if (remoteViews2 != null) {
            this.b.setCustomBigContentView(remoteViews2);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            a.b(this.b);
            a.d(this.b);
            a.e(this.b);
            a.f(this.b);
            i = 0;
            a.c(this.b, 0);
            if (!TextUtils.isEmpty(g1yVar.u)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        } else {
            i = 0;
        }
        if (i13 >= 28) {
            int size6 = arrayList3.size();
            int i14 = i;
            while (i14 < size6) {
                kh00 kh00Var2 = arrayList3.get(i14);
                i14++;
                kh00 kh00Var3 = kh00Var2;
                Notification.Builder builder2 = this.b;
                kh00Var3.getClass();
                b.a(builder2, kh00.a.a(kh00Var3));
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            c.a(this.b, g1yVar.v);
            c.b(this.b);
        }
        if (g1yVar.x) {
            this.c.getClass();
            this.e = 1;
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i16 = notification.defaults & (-4);
            notification.defaults = i16;
            this.b.setDefaults(i16);
            if (i15 >= 26) {
                this.c.getClass();
                if (TextUtils.isEmpty(null)) {
                    this.b.setGroup("silent");
                }
                a.c(this.b, 1);
            }
        }
    }
}
