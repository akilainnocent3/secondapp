package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class wln {
    public final c a;

    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public wln(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static final class a implements c {
        public final InputContentInfo a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // wln.c
        public final ClipDescription a() {
            return this.a.getDescription();
        }

        @Override // wln.c
        public final Object b() {
            return this.a;
        }

        @Override // wln.c
        public final Uri c() {
            return this.a.getContentUri();
        }

        @Override // wln.c
        public final void d() {
            this.a.requestPermission();
        }

        @Override // wln.c
        public final Uri e() {
            return this.a.getLinkUri();
        }

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }
    }

    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // wln.c
        public final ClipDescription a() {
            return this.b;
        }

        @Override // wln.c
        public final Object b() {
            return null;
        }

        @Override // wln.c
        public final Uri c() {
            return this.a;
        }

        @Override // wln.c
        public final Uri e() {
            return this.c;
        }

        @Override // wln.c
        public final void d() {
        }
    }

    public wln(a aVar) {
        this.a = aVar;
    }
}
