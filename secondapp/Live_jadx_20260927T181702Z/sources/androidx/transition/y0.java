package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public View f19711b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f19710a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<g0> f19712c = new ArrayList<>();

    @Deprecated
    public y0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f19711b == y0Var.f19711b && this.f19710a.equals(y0Var.f19710a);
    }

    public int hashCode() {
        return (this.f19711b.hashCode() * 31) + this.f19710a.hashCode();
    }

    @NonNull
    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f19711b + IOUtils.LINE_SEPARATOR_UNIX) + "    values:";
        for (String str2 : this.f19710a.keySet()) {
            str = str + ew.b0.f81731a + str2 + ": " + this.f19710a.get(str2) + IOUtils.LINE_SEPARATOR_UNIX;
        }
        return str;
    }

    public y0(@NonNull View view) {
        this.f19711b = view;
    }
}
