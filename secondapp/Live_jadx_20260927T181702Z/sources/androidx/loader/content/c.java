package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e2.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c<D> {
    Context mContext;
    int mId;
    InterfaceC0100c<D> mListener;
    b<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            c.this.onContentChanged();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<D> {
        void a(@NonNull c<D> cVar);
    }

    /* JADX INFO: renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0100c<D> {
        void a(@NonNull c<D> cVar, @Nullable D d10);
    }

    public c(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    @j0
    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    @j0
    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @NonNull
    public String dataToString(@Nullable D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        j.a(d10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    @j0
    public void deliverCancellation() {
        b<D> bVar = this.mOnLoadCanceledListener;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @j0
    public void deliverResult(@Nullable D d10) {
        InterfaceC0100c<D> interfaceC0100c = this.mListener;
        if (interfaceC0100c != null) {
            interfaceC0100c.a(this, d10);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    @j0
    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    @j0
    public boolean onCancelLoad() {
        return false;
    }

    @j0
    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    @j0
    public void registerListener(int i10, @NonNull InterfaceC0100c<D> interfaceC0100c) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC0100c;
        this.mId = i10;
    }

    @j0
    public void registerOnLoadCanceledListener(@NonNull b<D> bVar) {
        if (this.mOnLoadCanceledListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mOnLoadCanceledListener = bVar;
    }

    @j0
    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    @j0
    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    @j0
    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z10 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z10;
        return z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        j.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.mId);
        sb2.append("}");
        return sb2.toString();
    }

    @j0
    public void unregisterListener(@NonNull InterfaceC0100c<D> interfaceC0100c) {
        InterfaceC0100c<D> interfaceC0100c2 = this.mListener;
        if (interfaceC0100c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0100c2 != interfaceC0100c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    @j0
    public void unregisterOnLoadCanceledListener(@NonNull b<D> bVar) {
        b<D> bVar2 = this.mOnLoadCanceledListener;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mOnLoadCanceledListener = null;
    }

    @j0
    public void onAbandon() {
    }

    @j0
    public void onForceLoad() {
    }

    @j0
    public void onReset() {
    }

    @j0
    public void onStartLoading() {
    }

    @j0
    public void onStopLoading() {
    }
}
