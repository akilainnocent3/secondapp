package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import cs.g;
import er.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final IntentSender f6125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public final Intent f6126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public static final c f6124f = new c(null);

    @l
    @g
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final IntentSender f6129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @m
        public Intent f6130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6132d;

        /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @e(er.a.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0030a {
        }

        public a(@l IntentSender intentSender) {
            m0.p(intentSender, "intentSender");
            this.f6129a = intentSender;
        }

        @l
        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f6129a, this.f6130b, this.f6131c, this.f6132d);
        }

        @l
        public final a b(@m Intent intent) {
            this.f6130b = intent;
            return this;
        }

        @l
        public final a c(int i10, int i11) {
            this.f6132d = i10;
            this.f6131c = i11;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@l PendingIntent pendingIntent) {
            m0.p(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            m0.o(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(@l Parcel inParcel) {
            m0.p(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        @l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(x xVar) {
            this();
        }

        public c() {
        }

        public static /* synthetic */ void a() {
        }
    }

    public IntentSenderRequest(@l IntentSender intentSender, @m Intent intent, int i10, int i11) {
        m0.p(intentSender, "intentSender");
        this.f6125b = intentSender;
        this.f6126c = intent;
        this.f6127d = i10;
        this.f6128e = i11;
    }

    @m
    public final Intent c() {
        return this.f6126c;
    }

    public final int d() {
        return this.f6127d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f6128e;
    }

    @l
    public final IntentSender f() {
        return this.f6125b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeParcelable(this.f6125b, i10);
        dest.writeParcelable(this.f6126c, i10);
        dest.writeInt(this.f6127d);
        dest.writeInt(this.f6128e);
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11, int i12, x xVar) {
        this(intentSender, (i12 & 2) != 0 ? null : intent, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(@l Parcel parcel) {
        m0.p(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        m0.m(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
