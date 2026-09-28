package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s9s;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final int A;
    public final String B;
    public final int C;
    public final boolean D;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String i;
    public final boolean v;
    public final boolean w;
    public final boolean y;
    public final boolean z;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.i = parcel.readString();
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.y = parcel.readInt() != 0;
        this.z = parcel.readInt() != 0;
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readInt() != 0;
    }

    public final Fragment a(g gVar, ClassLoader classLoader) {
        Fragment fragmentA = gVar.a(this.a);
        fragmentA.mWho = this.b;
        fragmentA.mFromLayout = this.c;
        fragmentA.mInDynamicContainer = this.d;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.e;
        fragmentA.mContainerId = this.f;
        fragmentA.mTag = this.i;
        fragmentA.mRetainInstance = this.v;
        fragmentA.mRemoving = this.w;
        fragmentA.mDetached = this.y;
        fragmentA.mHidden = this.z;
        fragmentA.mMaxState = s9s.b.values()[this.A];
        fragmentA.mTargetWho = this.B;
        fragmentA.mTargetRequestCode = this.C;
        fragmentA.mUserVisibleHint = this.D;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.v) {
            sb.append(" retainInstance");
        }
        if (this.w) {
            sb.append(" removing");
        }
        if (this.y) {
            sb.append(" detached");
        }
        if (this.z) {
            sb.append(" hidden");
        }
        String str2 = this.B;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.C);
        }
        if (this.D) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.i);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D ? 1 : 0);
    }

    public FragmentState(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.b = fragment.mWho;
        this.c = fragment.mFromLayout;
        this.d = fragment.mInDynamicContainer;
        this.e = fragment.mFragmentId;
        this.f = fragment.mContainerId;
        this.i = fragment.mTag;
        this.v = fragment.mRetainInstance;
        this.w = fragment.mRemoving;
        this.y = fragment.mDetached;
        this.z = fragment.mHidden;
        this.A = fragment.mMaxState.ordinal();
        this.B = fragment.mTargetWho;
        this.C = fragment.mTargetRequestCode;
        this.D = fragment.mUserVisibleHint;
    }
}
