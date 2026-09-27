package ki;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.p;
import k.q0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class b {
    @Nullable
    public static TypedValue a(@NonNull Context context, @k.f int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@NonNull Context context, @k.f int i10, boolean z10) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA == null || typedValueA.type != 18) {
            return z10;
        }
        return typedValueA.data != 0;
    }

    public static boolean c(@NonNull Context context, @k.f int i10, @NonNull String str) {
        return g(context, i10, str) != 0;
    }

    @q0
    public static int d(@NonNull Context context, @k.f int i10, @p int i11) {
        TypedValue typedValueA = a(context, i10);
        return (int) ((typedValueA == null || typedValueA.type != 5) ? context.getResources().getDimension(i11) : typedValueA.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int e(@NonNull Context context, @k.f int i10, int i11) {
        TypedValue typedValueA = a(context, i10);
        return (typedValueA == null || typedValueA.type != 16) ? i11 : typedValueA.data;
    }

    @q0
    public static int f(@NonNull Context context) {
        return d(context, ih.a.c.f91125rd, ih.a.f.Ec);
    }

    public static int g(@NonNull Context context, @k.f int i10, @NonNull String str) {
        return i(context, i10, str).data;
    }

    public static int h(@NonNull View view, @k.f int i10) {
        return j(view, i10).data;
    }

    @NonNull
    public static TypedValue i(@NonNull Context context, @k.f int i10, @NonNull String str) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    @NonNull
    public static TypedValue j(@NonNull View view, @k.f int i10) {
        return i(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
