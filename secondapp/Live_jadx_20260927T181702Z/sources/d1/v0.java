package d1;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import k.b1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f77668a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f77669b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f77670c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f77671d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f77672e = ".sharecompat_";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f77673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Intent f77674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public CharSequence f77675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ArrayList<String> f77676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ArrayList<String> f77677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public ArrayList<String> f77678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public ArrayList<Uri> f77679g;

        public a(@NonNull Context context) {
            Activity activity;
            this.f77673a = (Context) e2.x.l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f77674b = action;
            action.putExtra(v0.f77668a, context.getPackageName());
            action.putExtra(v0.f77669b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f77674b.putExtra(v0.f77670c, componentName);
                this.f77674b.putExtra(v0.f77671d, componentName);
            }
        }

        @NonNull
        @Deprecated
        public static a k(@NonNull Activity activity) {
            return new a(activity);
        }

        @NonNull
        public a a(@NonNull String str) {
            if (this.f77678f == null) {
                this.f77678f = new ArrayList<>();
            }
            this.f77678f.add(str);
            return this;
        }

        @NonNull
        public a b(@NonNull String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            if (this.f77677e == null) {
                this.f77677e = new ArrayList<>();
            }
            this.f77677e.add(str);
            return this;
        }

        @NonNull
        public a d(@NonNull String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            if (this.f77676d == null) {
                this.f77676d = new ArrayList<>();
            }
            this.f77676d.add(str);
            return this;
        }

        @NonNull
        public a f(@NonNull String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @NonNull
        public a g(@NonNull Uri uri) {
            if (this.f77679g == null) {
                this.f77679g = new ArrayList<>();
            }
            this.f77679g.add(uri);
            return this;
        }

        public final void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f77674b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f77674b.putExtra(str, strArr);
        }

        public final void i(@Nullable String str, @NonNull String[] strArr) {
            Intent intentM = m();
            String[] stringArrayExtra = intentM.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intentM.putExtra(str, strArr2);
        }

        @NonNull
        public Intent j() {
            return Intent.createChooser(m(), this.f77675c);
        }

        @NonNull
        public Context l() {
            return this.f77673a;
        }

        @NonNull
        public Intent m() {
            ArrayList<String> arrayList = this.f77676d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.f77676d = null;
            }
            ArrayList<String> arrayList2 = this.f77677e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.f77677e = null;
            }
            ArrayList<String> arrayList3 = this.f77678f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f77678f = null;
            }
            ArrayList<Uri> arrayList4 = this.f77679g;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.f77674b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f77679g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f77674b.removeExtra("android.intent.extra.STREAM");
                    this.f77674b.setClipData(null);
                    Intent intent = this.f77674b;
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    this.f77674b.putExtra("android.intent.extra.STREAM", this.f77679g.get(0));
                    v0.g(this.f77674b, this.f77679g);
                }
            } else {
                this.f77674b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f77674b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f77679g);
                v0.g(this.f77674b, this.f77679g);
            }
            return this.f77674b;
        }

        @NonNull
        public a n(@b1 int i10) {
            return o(this.f77673a.getText(i10));
        }

        @NonNull
        public a o(@Nullable CharSequence charSequence) {
            this.f77675c = charSequence;
            return this;
        }

        @NonNull
        public a p(@Nullable String[] strArr) {
            this.f77674b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @NonNull
        public a q(@Nullable String[] strArr) {
            this.f77674b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @NonNull
        public a r(@Nullable String[] strArr) {
            if (this.f77676d != null) {
                this.f77676d = null;
            }
            this.f77674b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @NonNull
        public a s(@Nullable String str) {
            this.f77674b.putExtra(f1.f.f82212b, str);
            if (!this.f77674b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @NonNull
        public a t(@Nullable Uri uri) {
            this.f77679g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @NonNull
        public a u(@Nullable String str) {
            this.f77674b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @NonNull
        public a v(@Nullable CharSequence charSequence) {
            this.f77674b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @NonNull
        public a w(@Nullable String str) {
            this.f77674b.setType(str);
            return this;
        }

        public void x() {
            this.f77673a.startActivity(j());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f77680f = "IntentReader";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f77681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Intent f77682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f77683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final ComponentName f77684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ArrayList<Uri> f77685e;

        public b(@NonNull Activity activity) {
            this((Context) e2.x.l(activity), activity.getIntent());
        }

        @NonNull
        @Deprecated
        public static b a(@NonNull Activity activity) {
            return new b(activity);
        }

        @Nullable
        public ComponentName b() {
            return this.f77684d;
        }

        @Nullable
        public Drawable c() {
            if (this.f77684d == null) {
                return null;
            }
            try {
                return this.f77681a.getPackageManager().getActivityIcon(this.f77684d);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f77680f, "Could not retrieve icon for calling activity", e10);
                return null;
            }
        }

        @Nullable
        public Drawable d() {
            if (this.f77683c == null) {
                return null;
            }
            try {
                return this.f77681a.getPackageManager().getApplicationIcon(this.f77683c);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f77680f, "Could not retrieve icon for calling application", e10);
                return null;
            }
        }

        @Nullable
        public CharSequence e() {
            if (this.f77683c == null) {
                return null;
            }
            PackageManager packageManager = this.f77681a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f77683c, 0));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f77680f, "Could not retrieve label for calling application", e10);
                return null;
            }
        }

        @Nullable
        public String f() {
            return this.f77683c;
        }

        @Nullable
        public String[] g() {
            return this.f77682b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @Nullable
        public String[] h() {
            return this.f77682b.getStringArrayExtra("android.intent.extra.CC");
        }

        @Nullable
        public String[] i() {
            return this.f77682b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @Nullable
        public String j() {
            String stringExtra = this.f77682b.getStringExtra(f1.f.f82212b);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence charSequenceO = o();
            if (charSequenceO instanceof Spanned) {
                return Html.toHtml((Spanned) charSequenceO);
            }
            return charSequenceO != null ? Html.escapeHtml(charSequenceO) : stringExtra;
        }

        @Nullable
        public Uri k() {
            return (Uri) this.f77682b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @Nullable
        public Uri l(int i10) {
            if (this.f77685e == null && q()) {
                this.f77685e = this.f77682b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f77685e;
            if (arrayList != null) {
                return arrayList.get(i10);
            }
            if (i10 == 0) {
                return (Uri) this.f77682b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i10);
        }

        public int m() {
            if (this.f77685e == null && q()) {
                this.f77685e = this.f77682b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f77685e;
            return arrayList != null ? arrayList.size() : this.f77682b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @Nullable
        public String n() {
            return this.f77682b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @Nullable
        public CharSequence o() {
            return this.f77682b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @Nullable
        public String p() {
            return this.f77682b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f77682b.getAction());
        }

        public boolean r() {
            String action = this.f77682b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f77682b.getAction());
        }

        public b(@NonNull Context context, @NonNull Intent intent) {
            this.f77681a = (Context) e2.x.l(context);
            this.f77682b = (Intent) e2.x.l(intent);
            this.f77683c = v0.f(intent);
            this.f77684d = v0.d(intent);
        }
    }

    @Deprecated
    public static void a(@NonNull Menu menu, @k.c0 int i10, @NonNull a aVar) {
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem != null) {
            b(menuItemFindItem, aVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i10 + " in the supplied menu");
    }

    @Deprecated
    public static void b(@NonNull MenuItem menuItem, @NonNull a aVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(aVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f77672e + aVar.l().getClass().getName());
        shareActionProvider.setShareIntent(aVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @Nullable
    public static ComponentName c(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @Nullable
    public static ComponentName d(@NonNull Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f77670c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f77671d) : componentName;
    }

    @Nullable
    public static String e(@NonNull Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @Nullable
    public static String f(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra(f77668a);
        return stringExtra == null ? intent.getStringExtra(f77669b) : stringExtra;
    }

    public static void g(@NonNull Intent intent, @NonNull ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(f1.f.f82212b), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i10 = 1; i10 < size; i10++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i10)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
