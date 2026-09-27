package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import cs.g;
import cs.o;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public final Intent f6123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final b f6121d = new b(null);

    @l
    @g
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(@l Parcel parcel) {
            m0.p(parcel, "parcel");
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(x xVar) {
            this();
        }

        @l
        @o
        public final String b(int i10) {
            if (i10 != -1) {
                return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        public b() {
        }

        public static /* synthetic */ void a() {
        }
    }

    public ActivityResult(int i10, @m Intent intent) {
        this.f6122b = i10;
        this.f6123c = intent;
    }

    @l
    @o
    public static final String e(int i10) {
        return f6121d.b(i10);
    }

    @m
    public final Intent c() {
        return this.f6123c;
    }

    public final int d() {
        return this.f6122b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public String toString() {
        return "ActivityResult{resultCode=" + f6121d.b(this.f6122b) + ", data=" + this.f6123c + fw.b.f85383j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeInt(this.f6122b);
        dest.writeInt(this.f6123c == null ? 0 : 1);
        Intent intent = this.f6123c;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(@l Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        m0.p(parcel, "parcel");
    }
}
