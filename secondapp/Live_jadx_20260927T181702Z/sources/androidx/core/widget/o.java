package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9360a = "PopupWindowCompatApi21";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f9361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f9363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f9364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f9365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f9366g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(23)
    public static class a {
        @k.t
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @k.t
        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @k.t
        public static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        @k.t
        public static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static boolean a(@NonNull PopupWindow popupWindow) {
        return a.a(popupWindow);
    }

    public static int b(@NonNull PopupWindow popupWindow) {
        return a.b(popupWindow);
    }

    public static void c(@NonNull PopupWindow popupWindow, boolean z10) {
        a.c(popupWindow, z10);
    }

    public static void d(@NonNull PopupWindow popupWindow, int i10) {
        a.d(popupWindow, i10);
    }

    public static void e(@NonNull PopupWindow popupWindow, @NonNull View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
