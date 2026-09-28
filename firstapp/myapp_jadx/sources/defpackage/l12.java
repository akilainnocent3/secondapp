package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowMetrics;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import defpackage.g6i0;
import defpackage.j8i0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll12;", "Lj8i0;", "VM", "Lg6i0;", "B", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class l12<VM extends j8i0, B extends g6i0> extends Fragment {
    public VM a;
    public B b;

    public static double j0(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            return memoryInfo.totalMem / 1.073741824E9d;
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static void m0(e eVar) {
        eVar.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            eVar.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        } else {
            WindowMetrics currentWindowMetrics = eVar.getWindowManager().getCurrentWindowMetrics();
            currentWindowMetrics.getClass();
            currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).getClass();
            currentWindowMetrics.getBounds().height();
        }
    }

    public static int n0(e eVar) {
        eVar.getClass();
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            eVar.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
        WindowMetrics currentWindowMetrics = eVar.getWindowManager().getCurrentWindowMetrics();
        currentWindowMetrics.getClass();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
        insetsIgnoringVisibility.getClass();
        return (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
    }

    public abstract B o0();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        try {
            v8i0 viewModelStore = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            viewModelStore.getClass();
            defaultViewModelProviderFactory.getClass();
            defaultViewModelCreationExtras.getClass();
            s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
            Type genericSuperclass = getClass().getGenericSuperclass();
            genericSuperclass.getClass();
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            type.getClass();
            dq7 dq7VarA = jq40.a((Class) type);
            String strI = dq7VarA.i();
            if (strI == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.a = (VM) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            B b = (B) o0();
            this.b = b;
            return b.getRoot();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.b = null;
    }
}
