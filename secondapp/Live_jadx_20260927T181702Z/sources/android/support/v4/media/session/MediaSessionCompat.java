package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k.a0;
import k.t;
import k.t0;
import k.y0;
import q4.s;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    @y0({y0.a.LIBRARY})
    public static final String A = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    @y0({y0.a.LIBRARY})
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_QUERY";

    @y0({y0.a.LIBRARY})
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_URI";

    @y0({y0.a.LIBRARY})
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_RATING";

    @y0({y0.a.LIBRARY})
    public static final String E = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";

    @y0({y0.a.LIBRARY})
    public static final String F = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";

    @y0({y0.a.LIBRARY})
    public static final String G = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";

    @y0({y0.a.LIBRARY})
    public static final String H = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";

    @y0({y0.a.LIBRARY})
    public static final String I = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";

    @y0({y0.a.LIBRARY})
    public static final String J = "android.support.v4.media.session.TOKEN";

    @y0({y0.a.LIBRARY})
    public static final String K = "android.support.v4.media.session.EXTRA_BINDER";

    @y0({y0.a.LIBRARY})
    public static final String L = "android.support.v4.media.session.SESSION_TOKEN2";
    public static final int M = 320;
    public static final String N = "data_calling_pkg";
    public static final String O = "data_calling_pid";
    public static final String P = "data_calling_uid";
    public static final String Q = "data_extras";
    public static int R = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5770d = "MediaSessionCompat";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f5771e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f5772f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f5773g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f5774h = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f5775i = "android.support.v4.media.session.action.SKIP_AD";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f5776j = "android.support.v4.media.session.action.FOLLOW";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f5777k = "android.support.v4.media.session.action.UNFOLLOW";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f5778l = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f5779m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f5780n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5781o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f5782p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5783q = "android.support.v4.media.session.action.PLAY_FROM_URI";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5784r = "android.support.v4.media.session.action.PREPARE";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5785s = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5786t = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5787u = "android.support.v4.media.session.action.PREPARE_FROM_URI";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5788v = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5789w = "android.support.v4.media.session.action.SET_REPEAT_MODE";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5790x = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5791y = "android.support.v4.media.session.action.SET_RATING";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f5792z = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaControllerCompat f5794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<k> f5795c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f5796e = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaDescriptionCompat f5797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public MediaSession.QueueItem f5799d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @t0(21)
        public static class b {
            @t
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            @t
            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @t
            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            this(null, mediaDescriptionCompat, j10);
        }

        public static QueueItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(b.b(queueItem)), b.c(queueItem));
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.f5797b;
        }

        public long d() {
            return this.f5798c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            MediaSession.QueueItem queueItem = this.f5799d;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItemA = b.a((MediaDescription) this.f5797b.g(), this.f5798c);
            this.f5799d = queueItemA;
            return queueItemA;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f5797b + ", Id=" + this.f5798c + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f5797b.writeToParcel(parcel, i10);
            parcel.writeLong(this.f5798c);
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f5797b = mediaDescriptionCompat;
            this.f5798c = j10;
            this.f5799d = queueItem;
        }

        public QueueItem(Parcel parcel) {
            this.f5797b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f5798c = parcel.readLong();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f5801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f5802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a0("mLock")
        public android.support.v4.media.session.b f5803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @a0("mLock")
        public w9.h f5804e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public static Token a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            android.support.v4.media.session.b bVarN2 = android.support.v4.media.session.b.AbstractBinderC0025b.N2(d1.l.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            w9.h hVarC = w9.c.c(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            Token token = (Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token == null) {
                return null;
            }
            return new Token(token.f5802c, bVarN2, hVarC);
        }

        public static Token b(Object obj) {
            return c(obj, null);
        }

        @y0({y0.a.LIBRARY})
        public static Token c(Object obj, android.support.v4.media.session.b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @y0({y0.a.LIBRARY})
        public android.support.v4.media.session.b d() {
            android.support.v4.media.session.b bVar;
            synchronized (this.f5801b) {
                bVar = this.f5803d;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public w9.h e() {
            w9.h hVar;
            synchronized (this.f5801b) {
                hVar = this.f5804e;
            }
            return hVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f5802c;
            if (obj2 == null) {
                return token.f5802c == null;
            }
            Object obj3 = token.f5802c;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public Object f() {
            return this.f5802c;
        }

        @y0({y0.a.LIBRARY})
        public void g(android.support.v4.media.session.b bVar) {
            synchronized (this.f5801b) {
                this.f5803d = bVar;
            }
        }

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public void h(w9.h hVar) {
            synchronized (this.f5801b) {
                this.f5804e = hVar;
            }
        }

        public int hashCode() {
            Object obj = this.f5802c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public Bundle j() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.f5801b) {
                try {
                    android.support.v4.media.session.b bVar = this.f5803d;
                    if (bVar != null) {
                        d1.l.b(bundle, "android.support.v4.media.session.EXTRA_BINDER", bVar.asBinder());
                    }
                    w9.h hVar = this.f5804e;
                    if (hVar != null) {
                        w9.c.e(bundle, "android.support.v4.media.session.SESSION_TOKEN2", hVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f5802c, i10);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar, w9.h hVar) {
            this.f5801b = new Object();
            this.f5802c = obj;
            this.f5803d = bVar;
            this.f5804e = hVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends b {
        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {

        @a0("mLock")
        a mCallbackHandler;
        private boolean mMediaPlayPausePendingOnHandler;
        final Object mLock = new Object();
        final MediaSession.Callback mCallbackFwk = new C0022b();

        @a0("mLock")
        WeakReference<c> mSessionImpl = new WeakReference<>(null);

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends Handler {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f5806b = 1;

            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.mLock) {
                        cVar = b.this.mSessionImpl.get();
                        bVar = b.this;
                        aVar = bVar.mCallbackHandler;
                    }
                    if (cVar == null || bVar != cVar.j() || aVar == null) {
                        return;
                    }
                    cVar.p((q4.j.b) message.obj);
                    b.this.handleMediaPlayPauseIfPendingOnHandler(cVar, aVar);
                    cVar.p(null);
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @t0(21)
        public class C0022b extends MediaSession.Callback {
            public C0022b() {
            }

            public final void a(c cVar) {
                cVar.p(null);
            }

            public final f b() {
                f fVar;
                synchronized (b.this.mLock) {
                    fVar = (f) b.this.mSessionImpl.get();
                }
                if (fVar == null || b.this != fVar.j()) {
                    return null;
                }
                return fVar;
            }

            public final void c(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strD = cVar.d();
                if (TextUtils.isEmpty(strD)) {
                    strD = "android.media.session.MediaController";
                }
                cVar.p(new q4.j.b(strD, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(fVarB);
                try {
                    QueueItem queueItem = null;
                    IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token sessionToken = fVarB.getSessionToken();
                        android.support.v4.media.session.b bVarD = sessionToken.d();
                        if (bVarD != null) {
                            iBinderAsBinder = bVarD.asBinder();
                        }
                        d1.l.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinderAsBinder);
                        w9.c.e(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", sessionToken.e());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        b.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        b.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        b.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        b.this.onCommand(str, bundle, resultReceiver);
                    } else if (fVarB.f5819i != null) {
                        int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                        if (i10 >= 0 && i10 < fVarB.f5819i.size()) {
                            queueItem = fVarB.f5819i.get(i10);
                        }
                        if (queueItem != null) {
                            b.this.onRemoveQueueItem(queueItem.c());
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(fVarB);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle2);
                        b.this.onPlayFromUri(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        b.this.onPrepare();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle3);
                        b.this.onPrepareFromMediaId(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle4);
                        b.this.onPrepareFromSearch(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle5);
                        b.this.onPrepareFromUri(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        b.this.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        b.this.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        b.this.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle6);
                        b.this.onSetRating(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        b.this.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        b.this.onCustomAction(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onFastForward();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                f fVarB = b();
                if (fVarB == null) {
                    return false;
                }
                c(fVarB);
                boolean zOnMediaButtonEvent = b.this.onMediaButtonEvent(intent);
                a(fVarB);
                return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onPause();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onPlay();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(fVarB);
                b.this.onPlayFromMediaId(str, bundle);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(fVarB);
                b.this.onPlayFromSearch(str, bundle);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @t0(23)
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(fVarB);
                b.this.onPlayFromUri(uri, bundle);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @t0(24)
            public void onPrepare() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onPrepare();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @t0(24)
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(fVarB);
                b.this.onPrepareFromMediaId(str, bundle);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @t0(24)
            public void onPrepareFromSearch(String str, Bundle bundle) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(fVarB);
                b.this.onPrepareFromSearch(str, bundle);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @t0(24)
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                c(fVarB);
                b.this.onPrepareFromUri(uri, bundle);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onRewind();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j10) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onSeekTo(j10);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            @t0(29)
            public void onSetPlaybackSpeed(float f10) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onSetPlaybackSpeed(f10);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onSetRating(RatingCompat.a(rating));
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onSkipToNext();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onSkipToPrevious();
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j10) {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onSkipToQueueItem(j10);
                a(fVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                f fVarB = b();
                if (fVarB == null) {
                    return;
                }
                c(fVarB);
                b.this.onStop();
                a(fVarB);
            }
        }

        public void handleMediaPlayPauseIfPendingOnHandler(c cVar, Handler handler) {
            if (this.mMediaPlayPausePendingOnHandler) {
                this.mMediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackState = cVar.getPlaybackState();
                long jC = playbackState == null ? 0L : playbackState.c();
                boolean z10 = playbackState != null && playbackState.p() == 3;
                boolean z11 = (516 & jC) != 0;
                boolean z12 = (jC & 514) != 0;
                if (z10 && z12) {
                    onPause();
                } else {
                    if (z10 || !z11) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.mLock) {
                cVar = this.mSessionImpl.get();
                aVar = this.mCallbackHandler;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            q4.j.b bVarM = cVar.m();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                handleMediaPlayPauseIfPendingOnHandler(cVar, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                handleMediaPlayPauseIfPendingOnHandler(cVar, aVar);
            } else if (this.mMediaPlayPausePendingOnHandler) {
                aVar.removeMessages(1);
                this.mMediaPlayPausePendingOnHandler = false;
                PlaybackStateCompat playbackState = cVar.getPlaybackState();
                if (((playbackState == null ? 0L : playbackState.c()) & 32) != 0) {
                    onSkipToNext();
                }
            } else {
                this.mMediaPlayPausePendingOnHandler = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, bVarM), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void setSessionImpl(c cVar, Handler handler) {
            synchronized (this.mLock) {
                try {
                    this.mSessionImpl = new WeakReference<>(cVar);
                    a aVar = this.mCallbackHandler;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages(null);
                    }
                    if (cVar != null && handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                    this.mCallbackHandler = aVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPrepare() {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i10) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j10) {
        }

        public void onSetCaptioningEnabled(boolean z10) {
        }

        public void onSetPlaybackSpeed(float f10) {
        }

        public void onSetRepeatMode(int i10) {
        }

        public void onSetShuffleMode(int i10) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j10) {
        }

        public void onStop() {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(int i10);

        void b(String str, Bundle bundle);

        void c(int i10);

        String d();

        void e(PendingIntent pendingIntent);

        void f(boolean z10);

        void g(CharSequence charSequence);

        PlaybackStateCompat getPlaybackState();

        Token getSessionToken();

        void h(List<QueueItem> list);

        void i(PendingIntent pendingIntent);

        boolean isActive();

        b j();

        Object k();

        void l(int i10);

        q4.j.b m();

        void n(boolean z10);

        void o(b bVar, Handler handler);

        void p(q4.j.b bVar);

        void q(PlaybackStateCompat playbackStateCompat);

        void r(@Nullable l lVar, @NonNull Handler handler);

        void release();

        void s(int i10);

        void setExtras(Bundle bundle);

        void setRepeatMode(int i10);

        Object t();

        void u(MediaMetadataCompat mediaMetadataCompat);

        void v(s sVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(18)
    public static class d extends j {
        public static boolean G = true;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j10) {
                d.this.B(18, -1, -1, Long.valueOf(j10), null);
            }
        }

        public d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, w9.h hVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, hVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public int A(long j10) {
            int iA = super.A(j10);
            return (j10 & 256) != 0 ? iA | 256 : iA;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void C(PendingIntent pendingIntent, ComponentName componentName) {
            if (G) {
                try {
                    this.f5835g.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    G = false;
                }
            }
            if (G) {
                return;
            }
            super.C(pendingIntent, componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void O(PlaybackStateCompat playbackStateCompat) {
            long jO = playbackStateCompat.o();
            float fM = playbackStateCompat.m();
            long jL = playbackStateCompat.l();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.p() == 3) {
                long j10 = 0;
                if (jO > 0) {
                    if (jL > 0) {
                        j10 = jElapsedRealtime - jL;
                        if (fM > 0.0f && fM != 1.0f) {
                            j10 = (long) (j10 * fM);
                        }
                    }
                    jO += j10;
                }
            }
            this.f5836h.setPlaybackState(z(playbackStateCompat.p()), jO, fM);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void Q(PendingIntent pendingIntent, ComponentName componentName) {
            if (G) {
                this.f5835g.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.Q(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.c
        public void o(b bVar, Handler handler) {
            super.o(bVar, handler);
            if (bVar == null) {
                this.f5836h.setPlaybackPositionUpdateListener(null);
            } else {
                this.f5836h.setPlaybackPositionUpdateListener(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(19)
    public static class e extends d {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements RemoteControlClient.OnMetadataUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i10, Object obj) {
                if (i10 == 268435457 && (obj instanceof Rating)) {
                    e.this.B(19, -1, -1, RatingCompat.a(obj), null);
                }
            }
        }

        public e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, w9.h hVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, hVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.j
        public int A(long j10) {
            int iA = super.A(j10);
            return (j10 & 128) != 0 ? iA | 512 : iA;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.c
        public void o(b bVar, Handler handler) {
            super.o(bVar, handler);
            if (bVar == null) {
                this.f5836h.setMetadataUpdateListener(null);
            } else {
                this.f5836h.setMetadataUpdateListener(new a());
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public RemoteControlClient.MetadataEditor x(Bundle bundle) {
            RemoteControlClient.MetadataEditor metadataEditorX = super.x(bundle);
            PlaybackStateCompat playbackStateCompat = this.f5847s;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.c()) & 128) != 0) {
                metadataEditorX.addEditableKey(268435457);
            }
            if (bundle != null) {
                if (bundle.containsKey("android.media.metadata.YEAR")) {
                    metadataEditorX.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
                }
                if (bundle.containsKey("android.media.metadata.RATING")) {
                    metadataEditorX.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
                }
                if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                    metadataEditorX.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
                }
            }
            return metadataEditorX;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(22)
    public static class g extends f {
        public g(Context context, String str, w9.h hVar, Bundle bundle) {
            super(context, str, hVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public void c(int i10) {
            this.f5811a.setRatingType(i10);
        }

        public g(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static class h extends g {
        public h(Context context, String str, w9.h hVar, Bundle bundle) {
            super(context, str, hVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        @NonNull
        public final q4.j.b m() {
            return new q4.j.b(this.f5811a.getCurrentControllerInfo());
        }

        public h(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public void p(q4.j.b bVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(29)
    public static class i extends h {
        public i(Context context, String str, w9.h hVar, Bundle bundle) {
            super(context, str, hVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f
        public MediaSession w(Context context, String str, Bundle bundle) {
            return android.support.v4.media.session.j.a(context, str, bundle);
        }

        public i(Object obj) {
            super(obj);
            this.f5815e = ((MediaSession) obj).getController().getSessionInfo();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface k {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public interface l {
        void a(int i10, int i11);

        void b(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class m extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5888b = 1001;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f5889c = 1002;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f5890a;

        public m(@NonNull Looper looper, @NonNull l lVar) {
            super(looper);
            this.f5890a = lVar;
        }

        public void a(int i10, int i11) {
            obtainMessage(1001, i10, i11).sendToTarget();
        }

        public void b(int i10, int i11) {
            obtainMessage(1002, i10, i11).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1001) {
                this.f5890a.a(message.arg1, message.arg2);
            } else {
                if (i10 != 1002) {
                    return;
                }
                this.f5890a.b(message.arg1, message.arg2);
            }
        }
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str) {
        this(context, str, null, null);
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public static Bundle G(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    @y0({y0.a.LIBRARY})
    public static void b(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat c(Context context, Object obj) {
        c hVar;
        int i10 = Build.VERSION.SDK_INT;
        if (context == null || obj == null) {
            return null;
        }
        if (i10 >= 29) {
            hVar = new i(obj);
        } else {
            hVar = i10 >= 28 ? new h(obj) : new f(obj);
        }
        return new MediaSessionCompat(context, hVar);
    }

    public static PlaybackStateCompat j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j10;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long jF = -1;
        if (playbackStateCompat.o() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.p() != 3 && playbackStateCompat.p() != 4 && playbackStateCompat.p() != 5) {
            return playbackStateCompat;
        }
        long jL = playbackStateCompat.l();
        if (jL <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jM = ((long) (playbackStateCompat.m() * (jElapsedRealtime - jL))) + playbackStateCompat.o();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            jF = mediaMetadataCompat.f("android.media.metadata.DURATION");
        }
        if (jF < 0 || jM <= jF) {
            j10 = jM < 0 ? 0L : jM;
        } else {
            j10 = jF;
        }
        return new PlaybackStateCompat.e(playbackStateCompat).k(playbackStateCompat.p(), j10, playbackStateCompat.m(), jElapsedRealtime).c();
    }

    public void A(CharSequence charSequence) {
        this.f5793a.g(charSequence);
    }

    public void B(int i10) {
        this.f5793a.c(i10);
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public void C(@Nullable l lVar, @NonNull Handler handler) {
        this.f5793a.r(lVar, handler);
    }

    public void D(int i10) {
        this.f5793a.setRepeatMode(i10);
    }

    public void E(PendingIntent pendingIntent) {
        this.f5793a.i(pendingIntent);
    }

    public void F(int i10) {
        this.f5793a.l(i10);
    }

    public void a(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f5795c.add(kVar);
    }

    @y0({y0.a.LIBRARY})
    public String d() {
        return this.f5793a.d();
    }

    public MediaControllerCompat e() {
        return this.f5794b;
    }

    @NonNull
    public final q4.j.b f() {
        return this.f5793a.m();
    }

    public Object g() {
        return this.f5793a.k();
    }

    public Object h() {
        return this.f5793a.t();
    }

    public Token i() {
        return this.f5793a.getSessionToken();
    }

    public boolean k() {
        return this.f5793a.isActive();
    }

    public void l() {
        this.f5793a.release();
    }

    public void m(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f5795c.remove(kVar);
    }

    public void n(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f5793a.b(str, bundle);
    }

    public void o(boolean z10) {
        this.f5793a.f(z10);
        Iterator<k> it = this.f5795c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void p(b bVar) {
        q(bVar, null);
    }

    public void q(b bVar, Handler handler) {
        if (bVar == null) {
            this.f5793a.o(null, null);
            return;
        }
        c cVar = this.f5793a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.o(bVar, handler);
    }

    public void r(boolean z10) {
        this.f5793a.n(z10);
    }

    public void s(Bundle bundle) {
        this.f5793a.setExtras(bundle);
    }

    public void t(int i10) {
        this.f5793a.a(i10);
    }

    public void u(PendingIntent pendingIntent) {
        this.f5793a.e(pendingIntent);
    }

    public void v(MediaMetadataCompat mediaMetadataCompat) {
        this.f5793a.u(mediaMetadataCompat);
    }

    public void w(PlaybackStateCompat playbackStateCompat) {
        this.f5793a.q(playbackStateCompat);
    }

    public void x(int i10) {
        this.f5793a.s(i10);
    }

    public void y(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f5793a.v(sVar);
    }

    public void z(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.d()))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + queueItem.d(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(queueItem.d()));
            }
        }
        this.f5793a.h(list);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ResultReceiver f5800b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(@NonNull ResultReceiver resultReceiver) {
            this.f5800b = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f5800b.writeToParcel(parcel, i10);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f5800b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public MediaSessionCompat(@NonNull Context context, @NonNull String str, @Nullable ComponentName componentName, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable w9.h hVar) {
        this.f5795c = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = s4.d.c(context)) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    this.f5793a = new i(context, str, hVar, bundle);
                } else if (i10 >= 28) {
                    this.f5793a = new h(context, str, hVar, bundle);
                } else {
                    this.f5793a = new g(context, str, hVar, bundle);
                }
                q(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f5793a.e(pendingIntent);
                this.f5794b = new MediaControllerCompat(context, this);
                if (R == 0) {
                    R = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSession f5811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f5812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Token f5813c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f5815e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PlaybackStateCompat f5818h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<QueueItem> f5819i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public MediaMetadataCompat f5820j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f5821k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f5822l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f5823m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5824n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @a0("mLock")
        public b f5825o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @a0("mLock")
        public m f5826p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @a0("mLock")
        public q4.j.b f5827q;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f5814d = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5816f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final RemoteCallbackList<android.support.v4.media.session.a> f5817g = new RemoteCallbackList<>();

        public f(Context context, String str, w9.h hVar, Bundle bundle) {
            MediaSession mediaSessionW = w(context, str, bundle);
            this.f5811a = mediaSessionW;
            a aVar = new a(this);
            this.f5812b = aVar;
            this.f5813c = new Token(mediaSessionW.getSessionToken(), aVar, hVar);
            this.f5815e = bundle;
            a(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        @SuppressLint({"WrongConstant"})
        public void a(int i10) {
            this.f5811a.setFlags(i10 | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void b(String str, Bundle bundle) {
            this.f5811a.sendSessionEvent(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void c(int i10) {
            this.f5821k = i10;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String d() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f5811a.getClass().getMethod("getCallingPackage", null).invoke(this.f5811a, null);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void e(PendingIntent pendingIntent) {
            this.f5811a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void f(boolean z10) {
            this.f5811a.setActive(z10);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g(CharSequence charSequence) {
            this.f5811a.setQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat getPlaybackState() {
            return this.f5818h;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token getSessionToken() {
            return this.f5813c;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void h(List<QueueItem> list) {
            this.f5819i = list;
            if (list == null) {
                this.f5811a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((MediaSession.QueueItem) it.next().e());
            }
            this.f5811a.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void i(PendingIntent pendingIntent) {
            this.f5811a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean isActive() {
            return this.f5811a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b j() {
            b bVar;
            synchronized (this.f5814d) {
                bVar = this.f5825o;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object k() {
            return this.f5811a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l(int i10) {
            if (this.f5824n != i10) {
                this.f5824n = i10;
                synchronized (this.f5814d) {
                    for (int iBeginBroadcast = this.f5817g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.a) this.f5817g.getBroadcastItem(iBeginBroadcast)).p(i10);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f5817g.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public q4.j.b m() {
            q4.j.b bVar;
            synchronized (this.f5814d) {
                bVar = this.f5827q;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void n(boolean z10) {
            if (this.f5822l != z10) {
                this.f5822l = z10;
                synchronized (this.f5814d) {
                    for (int iBeginBroadcast = this.f5817g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.a) this.f5817g.getBroadcastItem(iBeginBroadcast)).t(z10);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f5817g.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void o(b bVar, Handler handler) {
            synchronized (this.f5814d) {
                try {
                    this.f5825o = bVar;
                    this.f5811a.setCallback(bVar == null ? null : bVar.mCallbackFwk, handler);
                    if (bVar != null) {
                        bVar.setSessionImpl(this, handler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void p(q4.j.b bVar) {
            synchronized (this.f5814d) {
                this.f5827q = bVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void q(PlaybackStateCompat playbackStateCompat) {
            this.f5818h = playbackStateCompat;
            synchronized (this.f5814d) {
                for (int iBeginBroadcast = this.f5817g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5817g.getBroadcastItem(iBeginBroadcast)).K2(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5817g.finishBroadcast();
            }
            this.f5811a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.n());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void r(@Nullable l lVar, @NonNull Handler handler) {
            synchronized (this.f5814d) {
                try {
                    m mVar = this.f5826p;
                    if (mVar != null) {
                        mVar.removeCallbacksAndMessages(null);
                    }
                    if (lVar != null) {
                        this.f5826p = new m(handler.getLooper(), lVar);
                    } else {
                        this.f5826p = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void release() {
            this.f5816f = true;
            this.f5817g.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f5811a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f5811a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e10) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                }
            }
            this.f5811a.setCallback(null);
            this.f5812b.O2();
            this.f5811a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void s(int i10) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            this.f5811a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setExtras(Bundle bundle) {
            this.f5811a.setExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setRepeatMode(int i10) {
            if (this.f5823m != i10) {
                this.f5823m = i10;
                synchronized (this.f5814d) {
                    for (int iBeginBroadcast = this.f5817g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((android.support.v4.media.session.a) this.f5817g.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i10);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f5817g.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object t() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void u(MediaMetadataCompat mediaMetadataCompat) {
            this.f5820j = mediaMetadataCompat;
            this.f5811a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.g());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void v(s sVar) {
            this.f5811a.setPlaybackToRemote((VolumeProvider) sVar.e());
        }

        public MediaSession w(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public f(Object obj) {
            if (obj instanceof MediaSession) {
                MediaSession mediaSession = (MediaSession) obj;
                this.f5811a = mediaSession;
                a aVar = new a(this);
                this.f5812b = aVar;
                this.f5813c = new Token(mediaSession.getSessionToken(), aVar);
                this.f5815e = null;
                a(3);
                return;
            }
            throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a extends android.support.v4.media.session.b.AbstractBinderC0025b {

            /* JADX INFO: renamed from: a0, reason: collision with root package name */
            public final AtomicReference<f> f5828a0;

            public a(@NonNull f fVar) {
                this.f5828a0 = new AtomicReference<>(fVar);
            }

            @Override // android.support.v4.media.session.b
            public void B(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent D() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void J1(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void L(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void N(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void O2() {
                this.f5828a0.set(null);
            }

            @Override // android.support.v4.media.session.b
            public void S(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo S0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void V(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void V1(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void W1(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void X(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void a2(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void e(float f10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long f() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean g() {
                f fVar = this.f5828a0.get();
                return fVar != null && fVar.f5822l;
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat getPlaybackState() {
                f fVar = this.f5828a0.get();
                if (fVar != null) {
                    return MediaSessionCompat.j(fVar.f5818h, fVar.f5820j);
                }
                return null;
            }

            @Override // android.support.v4.media.session.b
            public int getRepeatMode() {
                f fVar = this.f5828a0.get();
                if (fVar != null) {
                    return fVar.f5823m;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.b
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle h() {
                f fVar = this.f5828a0.get();
                if (fVar.f5815e == null) {
                    return null;
                }
                return new Bundle(fVar.f5815e);
            }

            @Override // android.support.v4.media.session.b
            public int i() {
                f fVar = this.f5828a0.get();
                if (fVar != null) {
                    return fVar.f5824n;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.b
            public void i1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void i2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence j() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int k() {
                f fVar = this.f5828a0.get();
                if (fVar != null) {
                    return fVar.f5821k;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void l(int i10) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> m() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void m1(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void n(boolean z10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void o0(android.support.v4.media.session.a aVar) {
                f fVar = this.f5828a0.get();
                if (fVar == null) {
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                fVar.f5817g.register(aVar, new q4.j.b("android.media.session.MediaController", callingPid, callingUid));
                synchronized (fVar.f5814d) {
                    try {
                        m mVar = fVar.f5826p;
                        if (mVar != null) {
                            mVar.a(callingPid, callingUid);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // android.support.v4.media.session.b
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean q0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void r(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void rewind() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean s1(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s2(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void seekTo(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void setRepeatMode(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void v(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void w0(android.support.v4.media.session.a aVar) {
                f fVar = this.f5828a0.get();
                if (fVar == null) {
                    return;
                }
                fVar.f5817g.unregister(aVar);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (fVar.f5814d) {
                    try {
                        m mVar = fVar.f5826p;
                        if (mVar != null) {
                            mVar.b(callingPid, callingUid);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // android.support.v4.media.session.b
            public void x1(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean z() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void e0(boolean z10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class j implements c {
        public static final int F = 0;
        public Bundle A;
        public int B;
        public int C;
        public s D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f5829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ComponentName f5830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PendingIntent f5831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f5832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Token f5833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bundle f5834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AudioManager f5835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final RemoteControlClient f5836h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public d f5839k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public volatile b f5842n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public q4.j.b f5843o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public m f5844p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public MediaMetadataCompat f5846r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public PlaybackStateCompat f5847s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public PendingIntent f5848t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public List<QueueItem> f5849u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence f5850v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f5851w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f5852x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f5853y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f5854z;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f5837i = new Object();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final RemoteCallbackList<android.support.v4.media.session.a> f5838j = new RemoteCallbackList<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f5840l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f5841m = false;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f5845q = 3;
        public s.d E = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends s.d {
            public a() {
            }

            @Override // q4.s.d
            public void a(s sVar) {
                if (j.this.D != sVar) {
                    return;
                }
                j jVar = j.this;
                j.this.N(new ParcelableVolumeInfo(jVar.B, jVar.C, sVar.c(), sVar.b(), sVar.a()));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5856a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Bundle f5857b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ResultReceiver f5858c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f5856a = str;
                this.f5857b = bundle;
                this.f5858c = resultReceiver;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class d extends Handler {
            public static final int A = 25;
            public static final int B = 26;
            public static final int C = 27;
            public static final int D = 28;
            public static final int E = 29;
            public static final int F = 30;
            public static final int G = 127;
            public static final int H = 126;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f5862b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f5863c = 2;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f5864d = 3;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f5865e = 4;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f5866f = 5;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f5867g = 6;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f5868h = 7;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f5869i = 8;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f5870j = 9;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f5871k = 10;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f5872l = 11;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f5873m = 12;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f5874n = 13;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f5875o = 14;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f5876p = 15;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f5877q = 16;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final int f5878r = 17;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final int f5879s = 18;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final int f5880t = 19;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static final int f5881u = 31;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final int f5882v = 32;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final int f5883w = 20;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final int f5884x = 21;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final int f5885y = 22;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final int f5886z = 23;

            public d(Looper looper) {
                super(looper);
            }

            public final void a(KeyEvent keyEvent, b bVar) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = j.this.f5847s;
                long jC = playbackStateCompat == null ? 0L : playbackStateCompat.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 126) {
                        if ((jC & 4) != 0) {
                            bVar.onPlay();
                            return;
                        }
                        return;
                    }
                    if (keyCode == 127) {
                        if ((jC & 2) != 0) {
                            bVar.onPause();
                            return;
                        }
                        return;
                    }
                    switch (keyCode) {
                        case 86:
                            if ((jC & 1) != 0) {
                                bVar.onStop();
                            }
                            break;
                        case 87:
                            if ((jC & 32) != 0) {
                                bVar.onSkipToNext();
                            }
                            break;
                        case 88:
                            if ((jC & 16) != 0) {
                                bVar.onSkipToPrevious();
                            }
                            break;
                        case 89:
                            if ((jC & 8) != 0) {
                                bVar.onRewind();
                            }
                            break;
                        case 90:
                            if ((jC & 64) != 0) {
                                bVar.onFastForward();
                            }
                            break;
                    }
                    return;
                }
                Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar = j.this.f5842n;
                if (bVar == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                j.this.p(new q4.j.b(data.getString(MediaSessionCompat.N), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle(MediaSessionCompat.Q);
                MediaSessionCompat.b(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            b bVar2 = (b) message.obj;
                            bVar.onCommand(bVar2.f5856a, bVar2.f5857b, bVar2.f5858c);
                            break;
                        case 2:
                            j.this.w(message.arg1, 0);
                            break;
                        case 3:
                            bVar.onPrepare();
                            break;
                        case 4:
                            bVar.onPrepareFromMediaId((String) message.obj, bundle);
                            break;
                        case 5:
                            bVar.onPrepareFromSearch((String) message.obj, bundle);
                            break;
                        case 6:
                            bVar.onPrepareFromUri((Uri) message.obj, bundle);
                            break;
                        case 7:
                            bVar.onPlay();
                            break;
                        case 8:
                            bVar.onPlayFromMediaId((String) message.obj, bundle);
                            break;
                        case 9:
                            bVar.onPlayFromSearch((String) message.obj, bundle);
                            break;
                        case 10:
                            bVar.onPlayFromUri((Uri) message.obj, bundle);
                            break;
                        case 11:
                            bVar.onSkipToQueueItem(((Long) message.obj).longValue());
                            break;
                        case 12:
                            bVar.onPause();
                            break;
                        case 13:
                            bVar.onStop();
                            break;
                        case 14:
                            bVar.onSkipToNext();
                            break;
                        case 15:
                            bVar.onSkipToPrevious();
                            break;
                        case 16:
                            bVar.onFastForward();
                            break;
                        case 17:
                            bVar.onRewind();
                            break;
                        case 18:
                            bVar.onSeekTo(((Long) message.obj).longValue());
                            break;
                        case 19:
                            bVar.onSetRating((RatingCompat) message.obj);
                            break;
                        case 20:
                            bVar.onCustomAction((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!bVar.onMediaButtonEvent(intent)) {
                                a(keyEvent, bVar);
                            }
                            break;
                        case 22:
                            j.this.P(message.arg1, 0);
                            break;
                        case 23:
                            bVar.onSetRepeatMode(message.arg1);
                            break;
                        case 25:
                            bVar.onAddQueueItem((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            bVar.onAddQueueItem((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            bVar.onRemoveQueueItem((MediaDescriptionCompat) message.obj);
                            break;
                        case 28:
                            List<QueueItem> list = j.this.f5849u;
                            if (list != null) {
                                int i10 = message.arg1;
                                QueueItem queueItem = (i10 < 0 || i10 >= list.size()) ? null : j.this.f5849u.get(message.arg1);
                                if (queueItem != null) {
                                    bVar.onRemoveQueueItem(queueItem.c());
                                }
                            }
                            break;
                        case 29:
                            bVar.onSetCaptioningEnabled(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            bVar.onSetShuffleMode(message.arg1);
                            break;
                        case 31:
                            bVar.onSetRating((RatingCompat) message.obj, bundle);
                            break;
                        case 32:
                            bVar.onSetPlaybackSpeed(((Float) message.obj).floatValue());
                            break;
                    }
                } finally {
                    j.this.p(null);
                }
            }
        }

        public j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, w9.h hVar, Bundle bundle) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.f5829a = context;
            this.f5834f = bundle;
            this.f5835g = (AudioManager) context.getSystemService("audio");
            this.f5830b = componentName;
            this.f5831c = pendingIntent;
            c cVar = new c(this, context.getPackageName(), str);
            this.f5832d = cVar;
            this.f5833e = new Token(cVar, null, hVar);
            this.f5851w = 0;
            this.B = 1;
            this.C = 3;
            this.f5836h = new RemoteControlClient(pendingIntent);
        }

        public int A(long j10) {
            int i10 = (1 & j10) != 0 ? 32 : 0;
            if ((2 & j10) != 0) {
                i10 |= 16;
            }
            if ((4 & j10) != 0) {
                i10 |= 4;
            }
            if ((8 & j10) != 0) {
                i10 |= 2;
            }
            if ((16 & j10) != 0) {
                i10 |= 1;
            }
            if ((32 & j10) != 0) {
                i10 |= 128;
            }
            if ((64 & j10) != 0) {
                i10 |= 64;
            }
            return (j10 & 512) != 0 ? i10 | 8 : i10;
        }

        public void B(int i10, int i11, int i12, Object obj, Bundle bundle) {
            synchronized (this.f5837i) {
                try {
                    d dVar = this.f5839k;
                    if (dVar != null) {
                        Message messageObtainMessage = dVar.obtainMessage(i10, i11, i12, obj);
                        Bundle bundle2 = new Bundle();
                        int callingUid = Binder.getCallingUid();
                        bundle2.putInt("data_calling_uid", callingUid);
                        bundle2.putString(MediaSessionCompat.N, y(callingUid));
                        int callingPid = Binder.getCallingPid();
                        if (callingPid > 0) {
                            bundle2.putInt("data_calling_pid", callingPid);
                        } else {
                            bundle2.putInt("data_calling_pid", -1);
                        }
                        if (bundle != null) {
                            bundle2.putBundle(MediaSessionCompat.Q, bundle);
                        }
                        messageObtainMessage.setData(bundle2);
                        messageObtainMessage.sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void C(PendingIntent pendingIntent, ComponentName componentName) {
            this.f5835g.registerMediaButtonEventReceiver(componentName);
        }

        public final void D(boolean z10) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).t(z10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public final void E(String str, Bundle bundle) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).onEvent(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public final void F(Bundle bundle) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).c2(bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public final void G(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).y1(mediaMetadataCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public final void H(List<QueueItem> list) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).H(list);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public final void I(CharSequence charSequence) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).r2(charSequence);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public final void J(int i10) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public final void K() {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).T();
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
                this.f5838j.kill();
            }
        }

        public final void L(int i10) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).p(i10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public final void M(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).K2(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public void N(ParcelableVolumeInfo parcelableVolumeInfo) {
            synchronized (this.f5837i) {
                for (int iBeginBroadcast = this.f5838j.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f5838j.getBroadcastItem(iBeginBroadcast)).O1(parcelableVolumeInfo);
                    } catch (RemoteException unused) {
                    }
                }
                this.f5838j.finishBroadcast();
            }
        }

        public void O(PlaybackStateCompat playbackStateCompat) {
            this.f5836h.setPlaybackState(z(playbackStateCompat.p()));
        }

        public void P(int i10, int i11) {
            if (this.B != 2) {
                this.f5835g.setStreamVolume(this.C, i10, i11);
                return;
            }
            s sVar = this.D;
            if (sVar != null) {
                sVar.g(i10);
            }
        }

        public void Q(PendingIntent pendingIntent, ComponentName componentName) {
            this.f5835g.unregisterMediaButtonEventReceiver(componentName);
        }

        public void R() {
            if (!this.f5841m) {
                Q(this.f5831c, this.f5830b);
                this.f5836h.setPlaybackState(0);
                this.f5835g.unregisterRemoteControlClient(this.f5836h);
            } else {
                C(this.f5831c, this.f5830b);
                this.f5835g.registerRemoteControlClient(this.f5836h);
                u(this.f5846r);
                q(this.f5847s);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void a(int i10) {
            synchronized (this.f5837i) {
                this.f5845q = i10 | 3;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void b(String str, Bundle bundle) {
            E(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void c(int i10) {
            this.f5851w = i10;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String d() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void f(boolean z10) {
            if (z10 == this.f5841m) {
                return;
            }
            this.f5841m = z10;
            R();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g(CharSequence charSequence) {
            this.f5850v = charSequence;
            I(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f5837i) {
                playbackStateCompat = this.f5847s;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token getSessionToken() {
            return this.f5833e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void h(List<QueueItem> list) {
            this.f5849u = list;
            H(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void i(PendingIntent pendingIntent) {
            synchronized (this.f5837i) {
                this.f5848t = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean isActive() {
            return this.f5841m;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b j() {
            b bVar;
            synchronized (this.f5837i) {
                bVar = this.f5842n;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object k() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l(int i10) {
            if (this.f5854z != i10) {
                this.f5854z = i10;
                L(i10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public q4.j.b m() {
            q4.j.b bVar;
            synchronized (this.f5837i) {
                bVar = this.f5843o;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void n(boolean z10) {
            if (this.f5852x != z10) {
                this.f5852x = z10;
                D(z10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void o(b bVar, Handler handler) {
            synchronized (this.f5837i) {
                try {
                    d dVar = this.f5839k;
                    if (dVar != null) {
                        dVar.removeCallbacksAndMessages(null);
                    }
                    this.f5839k = (bVar == null || handler == null) ? null : new d(handler.getLooper());
                    if (this.f5842n != bVar && this.f5842n != null) {
                        this.f5842n.setSessionImpl(null, null);
                    }
                    this.f5842n = bVar;
                    if (this.f5842n != null) {
                        this.f5842n.setSessionImpl(this, handler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void p(q4.j.b bVar) {
            synchronized (this.f5837i) {
                this.f5843o = bVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void q(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f5837i) {
                this.f5847s = playbackStateCompat;
            }
            M(playbackStateCompat);
            if (this.f5841m) {
                if (playbackStateCompat == null) {
                    this.f5836h.setPlaybackState(0);
                    this.f5836h.setTransportControlFlags(0);
                } else {
                    O(playbackStateCompat);
                    this.f5836h.setTransportControlFlags(A(playbackStateCompat.c()));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void r(@Nullable l lVar, @NonNull Handler handler) {
            synchronized (this.f5837i) {
                try {
                    m mVar = this.f5844p;
                    if (mVar != null) {
                        mVar.removeCallbacksAndMessages(null);
                    }
                    if (lVar != null) {
                        this.f5844p = new m(handler.getLooper(), lVar);
                    } else {
                        this.f5844p = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void release() {
            this.f5841m = false;
            this.f5840l = true;
            R();
            K();
            o(null, null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void s(int i10) {
            s sVar = this.D;
            if (sVar != null) {
                sVar.h(null);
            }
            this.C = i10;
            this.B = 1;
            int i11 = this.B;
            int i12 = this.C;
            N(new ParcelableVolumeInfo(i11, i12, 2, this.f5835g.getStreamMaxVolume(i12), this.f5835g.getStreamVolume(this.C)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setExtras(Bundle bundle) {
            this.A = bundle;
            F(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setRepeatMode(int i10) {
            if (this.f5853y != i10) {
                this.f5853y = i10;
                J(i10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object t() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void u(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.R).a();
            }
            synchronized (this.f5837i) {
                this.f5846r = mediaMetadataCompat;
            }
            G(mediaMetadataCompat);
            if (this.f5841m) {
                x(mediaMetadataCompat == null ? null : mediaMetadataCompat.d()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void v(s sVar) {
            if (sVar == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            s sVar2 = this.D;
            if (sVar2 != null) {
                sVar2.h(null);
            }
            this.B = 2;
            this.D = sVar;
            N(new ParcelableVolumeInfo(this.B, this.C, this.D.c(), this.D.b(), this.D.a()));
            sVar.h(this.E);
        }

        public void w(int i10, int i11) {
            if (this.B != 2) {
                this.f5835g.adjustStreamVolume(this.C, i10, i11);
                return;
            }
            s sVar = this.D;
            if (sVar != null) {
                sVar.f(i10);
            }
        }

        public RemoteControlClient.MetadataEditor x(Bundle bundle) {
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.f5836h.editMetadata(true);
            if (bundle != null) {
                if (bundle.containsKey("android.media.metadata.ART")) {
                    Bitmap bitmapCopy = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                    if (bitmapCopy != null) {
                        bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), false);
                    }
                    metadataEditorEditMetadata.putBitmap(100, bitmapCopy);
                } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                    Bitmap bitmapCopy2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                    if (bitmapCopy2 != null) {
                        bitmapCopy2 = bitmapCopy2.copy(bitmapCopy2.getConfig(), false);
                    }
                    metadataEditorEditMetadata.putBitmap(100, bitmapCopy2);
                }
                if (bundle.containsKey("android.media.metadata.ALBUM")) {
                    metadataEditorEditMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
                }
                if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                    metadataEditorEditMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
                }
                if (bundle.containsKey("android.media.metadata.ARTIST")) {
                    metadataEditorEditMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
                }
                if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                    metadataEditorEditMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
                }
                if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                    metadataEditorEditMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
                }
                if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                    metadataEditorEditMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
                }
                if (bundle.containsKey("android.media.metadata.DATE")) {
                    metadataEditorEditMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
                }
                if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                    metadataEditorEditMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
                }
                if (bundle.containsKey("android.media.metadata.DURATION")) {
                    metadataEditorEditMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
                }
                if (bundle.containsKey("android.media.metadata.GENRE")) {
                    metadataEditorEditMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
                }
                if (bundle.containsKey("android.media.metadata.TITLE")) {
                    metadataEditorEditMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
                }
                if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                    metadataEditorEditMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
                }
                if (bundle.containsKey("android.media.metadata.WRITER")) {
                    metadataEditorEditMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
                }
            }
            return metadataEditorEditMetadata;
        }

        public String y(int i10) {
            String nameForUid = this.f5829a.getPackageManager().getNameForUid(i10);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        public int z(int i10) {
            switch (i10) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class c extends android.support.v4.media.session.b.AbstractBinderC0025b {

            /* JADX INFO: renamed from: a0, reason: collision with root package name */
            public final AtomicReference<j> f5859a0;

            /* JADX INFO: renamed from: b0, reason: collision with root package name */
            public final String f5860b0;

            /* JADX INFO: renamed from: c0, reason: collision with root package name */
            public final String f5861c0;

            public c(j jVar, String str, String str2) {
                this.f5859a0 = new AtomicReference<>(jVar);
                this.f5860b0 = str;
                this.f5861c0 = str2;
            }

            @Override // android.support.v4.media.session.b
            public void B(Uri uri, Bundle bundle) {
                S2(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent D() {
                PendingIntent pendingIntent;
                j jVar = this.f5859a0.get();
                if (jVar == null) {
                    return null;
                }
                synchronized (jVar.f5837i) {
                    pendingIntent = jVar.f5848t;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.b
            public void J1(long j10) {
                Q2(11, Long.valueOf(j10));
            }

            @Override // android.support.v4.media.session.b
            public void L(String str, Bundle bundle) {
                S2(4, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void N(String str, Bundle bundle) {
                S2(8, str, bundle);
            }

            public void O2(int i10) {
                R2(i10, null, 0, null);
            }

            public void P2(int i10, int i11) {
                R2(i10, null, i11, null);
            }

            public void Q2(int i10, Object obj) {
                R2(i10, obj, 0, null);
            }

            public void R2(int i10, Object obj, int i11, Bundle bundle) {
                j jVar = this.f5859a0.get();
                if (jVar != null) {
                    jVar.B(i10, i11, 0, obj, bundle);
                }
            }

            @Override // android.support.v4.media.session.b
            public void S(RatingCompat ratingCompat, Bundle bundle) {
                S2(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo S0() {
                int streamVolume;
                int iB;
                ParcelableVolumeInfo parcelableVolumeInfo;
                j jVar = this.f5859a0.get();
                if (jVar == null) {
                    return null;
                }
                synchronized (jVar.f5837i) {
                    try {
                        int i10 = jVar.B;
                        int i11 = jVar.C;
                        s sVar = jVar.D;
                        int iC = 2;
                        if (i10 == 2) {
                            iC = sVar.c();
                            iB = sVar.b();
                            streamVolume = sVar.a();
                        } else {
                            int streamMaxVolume = jVar.f5835g.getStreamMaxVolume(i11);
                            streamVolume = jVar.f5835g.getStreamVolume(i11);
                            iB = streamMaxVolume;
                        }
                        parcelableVolumeInfo = new ParcelableVolumeInfo(i10, i11, iC, iB, streamVolume);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return parcelableVolumeInfo;
            }

            public void S2(int i10, Object obj, Bundle bundle) {
                R2(i10, obj, 0, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void V(int i10) {
                P2(28, i10);
            }

            @Override // android.support.v4.media.session.b
            public void V1(RatingCompat ratingCompat) {
                Q2(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.b
            public void W1(int i10, int i11, String str) {
                j jVar = this.f5859a0.get();
                if (jVar != null) {
                    jVar.P(i10, i11);
                }
            }

            @Override // android.support.v4.media.session.b
            public void X(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                Q2(1, new b(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.f5800b));
            }

            @Override // android.support.v4.media.session.b
            public void a2(String str, Bundle bundle) {
                S2(5, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void e(float f10) {
                Q2(32, Float.valueOf(f10));
            }

            @Override // android.support.v4.media.session.b
            public long f() {
                long j10;
                j jVar = this.f5859a0.get();
                if (jVar == null) {
                    return 0L;
                }
                synchronized (jVar.f5837i) {
                    j10 = jVar.f5845q;
                }
                return j10;
            }

            @Override // android.support.v4.media.session.b
            public boolean g() {
                j jVar = this.f5859a0.get();
                return jVar != null && jVar.f5852x;
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                Bundle bundle;
                j jVar = this.f5859a0.get();
                if (jVar == null) {
                    return null;
                }
                synchronized (jVar.f5837i) {
                    bundle = jVar.A;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                j jVar = this.f5859a0.get();
                if (jVar != null) {
                    return jVar.f5846r;
                }
                return null;
            }

            @Override // android.support.v4.media.session.b
            public String getPackageName() {
                return this.f5860b0;
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                j jVar = this.f5859a0.get();
                if (jVar == null) {
                    return null;
                }
                synchronized (jVar.f5837i) {
                    playbackStateCompat = jVar.f5847s;
                    mediaMetadataCompat = jVar.f5846r;
                }
                return MediaSessionCompat.j(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public int getRepeatMode() {
                j jVar = this.f5859a0.get();
                if (jVar != null) {
                    return jVar.f5853y;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.b
            public String getTag() {
                return this.f5861c0;
            }

            @Override // android.support.v4.media.session.b
            public Bundle h() {
                j jVar = this.f5859a0.get();
                if (jVar == null || jVar.f5834f == null) {
                    return null;
                }
                return new Bundle(jVar.f5834f);
            }

            @Override // android.support.v4.media.session.b
            public int i() {
                j jVar = this.f5859a0.get();
                if (jVar != null) {
                    return jVar.f5854z;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.b
            public void i1(String str, Bundle bundle) {
                S2(9, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void i2() {
                O2(16);
            }

            @Override // android.support.v4.media.session.b
            public CharSequence j() {
                j jVar = this.f5859a0.get();
                if (jVar != null) {
                    return jVar.f5850v;
                }
                return null;
            }

            @Override // android.support.v4.media.session.b
            public int k() {
                j jVar = this.f5859a0.get();
                if (jVar != null) {
                    return jVar.f5851w;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void l(int i10) {
                P2(30, i10);
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> m() {
                List<QueueItem> list;
                j jVar = this.f5859a0.get();
                if (jVar == null) {
                    return null;
                }
                synchronized (jVar.f5837i) {
                    list = jVar.f5849u;
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public void m1(Uri uri, Bundle bundle) {
                S2(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void n(boolean z10) {
                Q2(29, Boolean.valueOf(z10));
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                O2(14);
            }

            @Override // android.support.v4.media.session.b
            public void o0(android.support.v4.media.session.a aVar) {
                j jVar = this.f5859a0.get();
                if (jVar == null) {
                    try {
                        aVar.T();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                jVar.f5838j.register(aVar, new q4.j.b(jVar.y(callingUid), callingPid, callingUid));
                synchronized (jVar.f5837i) {
                    try {
                        m mVar = jVar.f5844p;
                        if (mVar != null) {
                            mVar.a(callingPid, callingUid);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // android.support.v4.media.session.b
            public void pause() {
                O2(12);
            }

            @Override // android.support.v4.media.session.b
            public void play() throws RemoteException {
                O2(7);
            }

            @Override // android.support.v4.media.session.b
            public void prepare() throws RemoteException {
                O2(3);
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                O2(15);
            }

            @Override // android.support.v4.media.session.b
            public boolean q0() {
                return true;
            }

            @Override // android.support.v4.media.session.b
            public void r(MediaDescriptionCompat mediaDescriptionCompat) {
                Q2(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public void rewind() {
                O2(17);
            }

            @Override // android.support.v4.media.session.b
            public void s(MediaDescriptionCompat mediaDescriptionCompat) {
                Q2(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public boolean s1(KeyEvent keyEvent) {
                Q2(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.b
            public void s2(int i10, int i11, String str) {
                j jVar = this.f5859a0.get();
                if (jVar != null) {
                    jVar.w(i10, i11);
                }
            }

            @Override // android.support.v4.media.session.b
            public void seekTo(long j10) {
                Q2(18, Long.valueOf(j10));
            }

            @Override // android.support.v4.media.session.b
            public void setRepeatMode(int i10) {
                P2(23, i10);
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                O2(13);
            }

            @Override // android.support.v4.media.session.b
            public void v(String str, Bundle bundle) throws RemoteException {
                S2(20, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void w0(android.support.v4.media.session.a aVar) {
                j jVar = this.f5859a0.get();
                if (jVar == null) {
                    return;
                }
                jVar.f5838j.unregister(aVar);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (jVar.f5837i) {
                    try {
                        m mVar = jVar.f5844p;
                        if (mVar != null) {
                            mVar.b(callingPid, callingUid);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // android.support.v4.media.session.b
            public void x1(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                R2(26, mediaDescriptionCompat, i10, null);
            }

            @Override // android.support.v4.media.session.b
            public boolean z() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void e0(boolean z10) {
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void e(PendingIntent pendingIntent) {
        }
    }

    public MediaSessionCompat(Context context, c cVar) {
        this.f5795c = new ArrayList<>();
        this.f5793a = cVar;
        this.f5794b = new MediaControllerCompat(context, this);
    }
}
