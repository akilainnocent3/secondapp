package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class i2 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7174c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<WeakReference<i2>> f7175d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f7176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f7177b;

    public i2(@NonNull Context context) {
        super(context);
        if (!y2.d()) {
            this.f7176a = new k2(this, context.getResources());
            this.f7177b = null;
            return;
        }
        y2 y2Var = new y2(this, context.getResources());
        this.f7176a = y2Var;
        Resources.Theme themeNewTheme = y2Var.newTheme();
        this.f7177b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(@NonNull Context context) {
        return ((context instanceof i2) || (context.getResources() instanceof k2) || (context.getResources() instanceof y2) || !y2.d()) ? false : true;
    }

    public static Context b(@NonNull Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f7174c) {
            try {
                ArrayList<WeakReference<i2>> arrayList = f7175d;
                if (arrayList == null) {
                    f7175d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<i2> weakReference = f7175d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f7175d.remove(size);
                        }
                    }
                    for (int size2 = f7175d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<i2> weakReference2 = f7175d.get(size2);
                        i2 i2Var = weakReference2 != null ? weakReference2.get() : null;
                        if (i2Var != null && i2Var.getBaseContext() == context) {
                            return i2Var;
                        }
                    }
                }
                i2 i2Var2 = new i2(context);
                f7175d.add(new WeakReference<>(i2Var2));
                return i2Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f7176a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f7176a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f7177b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f7177b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
