package d3;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f77713b = "DocumentFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f77714a;

    public a(@Nullable a aVar) {
        this.f77714a = aVar;
    }

    @NonNull
    public static a h(@NonNull File file) {
        return new c(null, file);
    }

    @Nullable
    public static a i(@NonNull Context context, @NonNull Uri uri) {
        return new d(null, context, uri);
    }

    @Nullable
    public static a j(@NonNull Context context, @NonNull Uri uri) {
        return new e(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean p(@NonNull Context context, @Nullable Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    @Nullable
    public abstract a c(@NonNull String str);

    @Nullable
    public abstract a d(@NonNull String str, @NonNull String str2);

    public abstract boolean e();

    public abstract boolean f();

    @Nullable
    public a g(@NonNull String str) {
        for (a aVar : u()) {
            if (str.equals(aVar.k())) {
                return aVar;
            }
        }
        return null;
    }

    @Nullable
    public abstract String k();

    @Nullable
    public a l() {
        return this.f77714a;
    }

    @Nullable
    public abstract String m();

    @NonNull
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @NonNull
    public abstract a[] u();

    public abstract boolean v(@NonNull String str);
}
