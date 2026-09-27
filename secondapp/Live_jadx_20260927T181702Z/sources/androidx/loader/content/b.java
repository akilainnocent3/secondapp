package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import u1.e;
import u1.y;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b extends a<Cursor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Cursor>.a f13486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f13487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f13488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f13490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f13491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Cursor f13492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f13493h;

    public b(@NonNull Context context) {
        super(context);
        this.f13486a = new c.a();
    }

    @Override // androidx.loader.content.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f13492g;
        this.f13492g = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Nullable
    public String[] b() {
        return this.f13488c;
    }

    @Nullable
    public String c() {
        return this.f13489d;
    }

    @Override // androidx.loader.content.a
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                e eVar = this.f13493h;
                if (eVar != null) {
                    eVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public String[] d() {
        return this.f13490e;
    }

    @Override // androidx.loader.content.a, androidx.loader.content.c
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f13487b);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f13488c));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f13489d);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f13490e));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f13491f);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f13492g);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.mContentChanged);
    }

    @Nullable
    public String e() {
        return this.f13491f;
    }

    @NonNull
    public Uri f() {
        return this.f13487b;
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new y();
            }
            this.f13493h = new e();
        }
        try {
            Cursor cursorB = f1.b.b(getContext().getContentResolver(), this.f13487b, this.f13488c, this.f13489d, this.f13490e, this.f13491f, this.f13493h);
            if (cursorB != null) {
                try {
                    cursorB.getCount();
                    cursorB.registerContentObserver(this.f13486a);
                } catch (RuntimeException e10) {
                    cursorB.close();
                    throw e10;
                }
            }
            synchronized (this) {
                this.f13493h = null;
            }
            return cursorB;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f13493h = null;
                throw th2;
            }
        }
    }

    @Override // androidx.loader.content.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void i(@Nullable String[] strArr) {
        this.f13488c = strArr;
    }

    public void j(@Nullable String str) {
        this.f13489d = str;
    }

    public void k(@Nullable String[] strArr) {
        this.f13490e = strArr;
    }

    public void l(@Nullable String str) {
        this.f13491f = str;
    }

    public void m(@NonNull Uri uri) {
        this.f13487b = uri;
    }

    @Override // androidx.loader.content.c
    public void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.f13492g;
        if (cursor != null && !cursor.isClosed()) {
            this.f13492g.close();
        }
        this.f13492g = null;
    }

    @Override // androidx.loader.content.c
    public void onStartLoading() {
        Cursor cursor = this.f13492g;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.f13492g == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.c
    public void onStopLoading() {
        cancelLoad();
    }

    public b(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        super(context);
        this.f13486a = new c.a();
        this.f13487b = uri;
        this.f13488c = strArr;
        this.f13489d = str;
        this.f13490e = strArr2;
        this.f13491f = str2;
    }
}
