package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import cj.v6;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.y0;
import x4.b2;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
@y0({y0.a.LIBRARY})
public final class PlaybackStateCompat implements Parcelable {
    public static final long A = 8192;
    public static final long B = 16384;
    public static final long C = 32768;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public static final long D = 65536;
    public static final long E = 131072;
    public static final long F = 262144;

    @Deprecated
    public static final long G = 524288;
    public static final long H = 1048576;
    public static final long I = 2097152;
    public static final long J = 4194304;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 3;
    public static final int O = 4;
    public static final int P = 5;
    public static final int Q = 6;
    public static final int R = 7;
    public static final int S = 8;
    public static final int T = 9;
    public static final int U = 10;
    public static final int V = 11;
    public static final long W = -1;
    public static final int X = -1;
    public static final int Y = 0;
    public static final int Z = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f15822a0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f15823b0 = 3;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f15824c0 = -1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f15825d0 = 0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f15826e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f15827f0 = 2;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f15828g0 = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f15829h0 = 1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f15830i0 = 2;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f15831j0 = 3;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f15832k0 = 4;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f15833l0 = 5;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f15834m0 = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f15835n = 1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f15836n0 = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f15837o = 2;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f15838o0 = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f15839p = 4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f15840p0 = 9;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f15841q = 8;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f15842q0 = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f15843r = 16;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f15844r0 = 11;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f15845s = 32;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f15846t = 64;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f15847u = 128;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f15848v = 256;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f15849w = 512;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f15850x = 1024;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f15851y = 2048;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f15852z = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final CharSequence f15859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<CustomAction> f15861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f15862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Bundle f15863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public PlaybackState f15864m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, @Nullable CharSequence charSequence, long j13, @Nullable List<CustomAction> list, long j14, @Nullable Bundle bundle) {
        this.f15853b = i10;
        this.f15854c = j10;
        this.f15855d = j11;
        this.f15856e = f10;
        this.f15857f = j12;
        this.f15858g = i11;
        this.f15859h = charSequence;
        this.f15860i = j13;
        this.f15861j = list == null ? v6.z() : new ArrayList<>(list);
        this.f15862k = j14;
        this.f15863l = bundle;
    }

    @Nullable
    public static PlaybackStateCompat a(@Nullable PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    arrayList.add(CustomAction.a(customAction));
                }
            }
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), b2.D(playbackState.getExtras()));
        playbackStateCompat.f15864m = playbackState;
        return playbackStateCompat;
    }

    public long c() {
        return this.f15857f;
    }

    public long d() {
        return this.f15862k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f15855d;
    }

    public long f(@Nullable Long l10) {
        return Math.max(0L, this.f15854c + ((long) (this.f15856e * (l10 != null ? l10.longValue() : SystemClock.elapsedRealtime() - this.f15860i))));
    }

    public List<CustomAction> g() {
        return this.f15861j;
    }

    public int h() {
        return this.f15858g;
    }

    @Nullable
    public CharSequence j() {
        return this.f15859h;
    }

    @Nullable
    public Bundle k() {
        return this.f15863l;
    }

    public long l() {
        return this.f15860i;
    }

    public float m() {
        return this.f15856e;
    }

    public PlaybackState n() {
        if (this.f15864m == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.f15853b, this.f15854c, this.f15856e, this.f15860i);
            builder.setBufferedPosition(this.f15855d);
            builder.setActions(this.f15857f);
            builder.setErrorMessage(this.f15859h);
            Iterator<CustomAction> it = this.f15861j.iterator();
            while (it.hasNext()) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) it.next().d();
                if (customAction != null) {
                    builder.addCustomAction(customAction);
                }
            }
            builder.setActiveQueueItemId(this.f15862k);
            builder.setExtras(this.f15863l);
            this.f15864m = builder.build();
        }
        return this.f15864m;
    }

    public long o() {
        return this.f15854c;
    }

    public int p() {
        return this.f15853b;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f15853b + ", position=" + this.f15854c + ", buffered position=" + this.f15855d + ", speed=" + this.f15856e + ", updated=" + this.f15860i + ", actions=" + this.f15857f + ", error code=" + this.f15858g + ", error message=" + this.f15859h + ", custom actions=" + this.f15861j + ", active item id=" + this.f15862k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15853b);
        parcel.writeLong(this.f15854c);
        parcel.writeFloat(this.f15856e);
        parcel.writeLong(this.f15860i);
        parcel.writeLong(this.f15855d);
        parcel.writeLong(this.f15857f);
        TextUtils.writeToParcel(this.f15859h, parcel, i10);
        parcel.writeTypedList(this.f15861j);
        parcel.writeLong(this.f15862k);
        parcel.writeBundle(this.f15863l);
        parcel.writeInt(this.f15858g);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<CustomAction> f15874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f15877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f15878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f15879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public CharSequence f15881h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f15882i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f15883j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public Bundle f15884k;

        public c() {
            this.f15874a = new ArrayList();
            this.f15883j = -1L;
        }

        public c a(CustomAction customAction) {
            this.f15874a.add(customAction);
            return this;
        }

        public c b(String str, String str2, int i10) {
            return a(new CustomAction(str, str2, i10, null));
        }

        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.f15875b, this.f15876c, this.f15877d, this.f15878e, this.f15879f, this.f15880g, this.f15881h, this.f15882i, this.f15874a, this.f15883j, this.f15884k);
        }

        public c d(long j10) {
            this.f15879f = j10;
            return this;
        }

        public c e(long j10) {
            this.f15883j = j10;
            return this;
        }

        public c f(long j10) {
            this.f15877d = j10;
            return this;
        }

        public c g(int i10, @Nullable CharSequence charSequence) {
            this.f15880g = i10;
            this.f15881h = charSequence;
            return this;
        }

        @Deprecated
        public c h(@Nullable CharSequence charSequence) {
            this.f15881h = charSequence;
            return this;
        }

        public c i(@Nullable Bundle bundle) {
            this.f15884k = bundle;
            return this;
        }

        public c j(int i10, long j10, float f10) {
            return k(i10, j10, f10, SystemClock.elapsedRealtime());
        }

        public c k(int i10, long j10, float f10, long j11) {
            this.f15875b = i10;
            this.f15876c = j10;
            this.f15882i = j11;
            this.f15878e = f10;
            return this;
        }

        public c(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f15874a = arrayList;
            this.f15883j = -1L;
            this.f15875b = playbackStateCompat.f15853b;
            this.f15876c = playbackStateCompat.f15854c;
            this.f15878e = playbackStateCompat.f15856e;
            this.f15882i = playbackStateCompat.f15860i;
            this.f15877d = playbackStateCompat.f15855d;
            this.f15879f = playbackStateCompat.f15857f;
            this.f15880g = playbackStateCompat.f15858g;
            this.f15881h = playbackStateCompat.f15859h;
            List<CustomAction> list = playbackStateCompat.f15861j;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f15883j = playbackStateCompat.f15862k;
            this.f15884k = playbackStateCompat.f15863l;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f15865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f15866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Bundle f15868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public PlaybackState.CustomAction f15869f;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f15870a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CharSequence f15871b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f15872c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public Bundle f15873d;

            public b(String str, CharSequence charSequence, int i10) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i10 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f15870a = str;
                this.f15871b = charSequence;
                this.f15872c = i10;
            }

            public CustomAction a() {
                return new CustomAction(this.f15870a, this.f15871b, this.f15872c, this.f15873d);
            }

            public b b(@Nullable Bundle bundle) {
                this.f15873d = bundle;
                return this;
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i10, @Nullable Bundle bundle) {
            this.f15865b = str;
            this.f15866c = charSequence;
            this.f15867d = i10;
            this.f15868e = bundle;
        }

        public static CustomAction a(Object obj) {
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), b2.D(customAction.getExtras()));
            customAction2.f15869f = customAction;
            return customAction2;
        }

        public String c() {
            return this.f15865b;
        }

        @Nullable
        public Object d() {
            PlaybackState.CustomAction customAction = this.f15869f;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.f15865b, this.f15866c, this.f15867d);
            builder.setExtras(this.f15868e);
            return builder.build();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public Bundle e() {
            return this.f15868e;
        }

        public int f() {
            return this.f15867d;
        }

        public CharSequence g() {
            return this.f15866c;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f15866c) + ", mIcon=" + this.f15867d + ", mExtras=" + this.f15868e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f15865b);
            TextUtils.writeToParcel(this.f15866c, parcel, i10);
            parcel.writeInt(this.f15867d);
            parcel.writeBundle(this.f15868e);
        }

        public CustomAction(Parcel parcel) {
            this.f15865b = (String) l0.E(parcel.readString());
            this.f15866c = (CharSequence) l0.E((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            this.f15867d = parcel.readInt();
            this.f15868e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f15853b = parcel.readInt();
        this.f15854c = parcel.readLong();
        this.f15856e = parcel.readFloat();
        this.f15860i = parcel.readLong();
        this.f15855d = parcel.readLong();
        this.f15857f = parcel.readLong();
        this.f15859h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List<CustomAction> listCreateTypedArrayList = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f15861j = listCreateTypedArrayList == null ? v6.z() : listCreateTypedArrayList;
        this.f15862k = parcel.readLong();
        this.f15863l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f15858g = parcel.readInt();
    }
}
