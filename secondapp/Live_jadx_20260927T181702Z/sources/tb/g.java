package tb;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g<T> implements m<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection<? extends m<T>> f136432c;

    @SafeVarargs
    public g(@NonNull m<T>... mVarArr) {
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f136432c = Arrays.asList(mVarArr);
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        Iterator<? extends m<T>> it = this.f136432c.iterator();
        while (it.hasNext()) {
            it.next().a(messageDigest);
        }
    }

    @Override // tb.m
    @NonNull
    public v<T> b(@NonNull Context context, @NonNull v<T> vVar, int i10, int i11) {
        Iterator<? extends m<T>> it = this.f136432c.iterator();
        v<T> vVar2 = vVar;
        while (it.hasNext()) {
            v<T> vVarB = it.next().b(context, vVar2, i10, i11);
            if (vVar2 != null && !vVar2.equals(vVar) && !vVar2.equals(vVarB)) {
                vVar2.a();
            }
            vVar2 = vVarB;
        }
        return vVar2;
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f136432c.equals(((g) obj).f136432c);
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        return this.f136432c.hashCode();
    }

    public g(@NonNull Collection<? extends m<T>> collection) {
        if (!collection.isEmpty()) {
            this.f136432c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
