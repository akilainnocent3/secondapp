package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.sportybet.android.gp.tz.R;
import defpackage.dl30;
import defpackage.ecv;
import defpackage.gof0;
import defpackage.pk30;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class BadgeState {
    public final State a;
    public final State b = new State();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public int l;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public Locale C;
        public CharSequence D;
        public CharSequence E;
        public int F;
        public int G;
        public Integer H;
        public Integer J;
        public Integer K;
        public Integer L;
        public Integer M;
        public Integer N;
        public Integer O;
        public Integer P;
        public Integer Q;
        public Integer R;
        public Boolean S;
        public Integer T;
        public int a;
        public Integer b;
        public Integer c;
        public Integer d;
        public Integer e;
        public Integer f;
        public Integer i;
        public Integer v;
        public String y;
        public int w = 255;
        public int z = -2;
        public int A = -2;
        public int B = -2;
        public Boolean I = Boolean.TRUE;

        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                State state = new State();
                state.w = 255;
                state.z = -2;
                state.A = -2;
                state.B = -2;
                state.I = Boolean.TRUE;
                state.a = parcel.readInt();
                state.b = (Integer) parcel.readSerializable();
                state.c = (Integer) parcel.readSerializable();
                state.d = (Integer) parcel.readSerializable();
                state.e = (Integer) parcel.readSerializable();
                state.f = (Integer) parcel.readSerializable();
                state.i = (Integer) parcel.readSerializable();
                state.v = (Integer) parcel.readSerializable();
                state.w = parcel.readInt();
                state.y = parcel.readString();
                state.z = parcel.readInt();
                state.A = parcel.readInt();
                state.B = parcel.readInt();
                state.D = parcel.readString();
                state.E = parcel.readString();
                state.F = parcel.readInt();
                state.H = (Integer) parcel.readSerializable();
                state.J = (Integer) parcel.readSerializable();
                state.K = (Integer) parcel.readSerializable();
                state.L = (Integer) parcel.readSerializable();
                state.M = (Integer) parcel.readSerializable();
                state.N = (Integer) parcel.readSerializable();
                state.O = (Integer) parcel.readSerializable();
                state.R = (Integer) parcel.readSerializable();
                state.P = (Integer) parcel.readSerializable();
                state.Q = (Integer) parcel.readSerializable();
                state.I = (Boolean) parcel.readSerializable();
                state.C = (Locale) parcel.readSerializable();
                state.S = (Boolean) parcel.readSerializable();
                state.T = (Integer) parcel.readSerializable();
                return state;
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeSerializable(this.b);
            parcel.writeSerializable(this.c);
            parcel.writeSerializable(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeSerializable(this.i);
            parcel.writeSerializable(this.v);
            parcel.writeInt(this.w);
            parcel.writeString(this.y);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
            parcel.writeInt(this.B);
            CharSequence charSequence = this.D;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.E;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.F);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.J);
            parcel.writeSerializable(this.K);
            parcel.writeSerializable(this.L);
            parcel.writeSerializable(this.M);
            parcel.writeSerializable(this.N);
            parcel.writeSerializable(this.O);
            parcel.writeSerializable(this.R);
            parcel.writeSerializable(this.P);
            parcel.writeSerializable(this.Q);
            parcel.writeSerializable(this.I);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.S);
            parcel.writeSerializable(this.T);
        }
    }

    public BadgeState(Context context, State state) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        State state2 = state == null ? new State() : state;
        int i = state2.a;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = gof0.d(context, attributeSet, pk30.c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(15, -1);
        this.e = typedArrayD.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayD.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayD.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(25, 1);
        this.l = typedArrayD.getInt(2, 0);
        State state3 = this.b;
        int i2 = state2.w;
        state3.w = i2 == -2 ? 255 : i2;
        int i3 = state2.z;
        if (i3 != -2) {
            state3.z = i3;
        } else {
            boolean zHasValue = typedArrayD.hasValue(24);
            State state4 = this.b;
            if (zHasValue) {
                state4.z = typedArrayD.getInt(24, 0);
            } else {
                state4.z = -1;
            }
        }
        String str = state2.y;
        if (str != null) {
            this.b.y = str;
        } else if (typedArrayD.hasValue(8)) {
            this.b.y = typedArrayD.getString(8);
        }
        State state5 = this.b;
        state5.D = state2.D;
        CharSequence charSequence = state2.E;
        state5.E = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state6 = this.b;
        int i4 = state2.F;
        state6.F = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = state2.G;
        state6.G = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = state2.I;
        state6.I = Boolean.valueOf(bool == null || bool.booleanValue());
        State state7 = this.b;
        int i6 = state2.A;
        state7.A = i6 == -2 ? typedArrayD.getInt(22, -2) : i6;
        State state8 = this.b;
        int i7 = state2.B;
        state8.B = i7 == -2 ? typedArrayD.getInt(23, -2) : i7;
        State state9 = this.b;
        Integer num = state2.e;
        state9.e = Integer.valueOf(num == null ? typedArrayD.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state10 = this.b;
        Integer num2 = state2.f;
        state10.f = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(7, 0) : num2.intValue());
        State state11 = this.b;
        Integer num3 = state2.i;
        state11.i = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state12 = this.b;
        Integer num4 = state2.v;
        state12.v = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(17, 0) : num4.intValue());
        State state13 = this.b;
        Integer num5 = state2.b;
        state13.b = Integer.valueOf(num5 == null ? ecv.a(1, context, typedArrayD).getDefaultColor() : num5.intValue());
        State state14 = this.b;
        Integer num6 = state2.d;
        state14.d = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state2.c;
        if (num7 != null) {
            this.b.c = num7;
        } else {
            boolean zHasValue2 = typedArrayD.hasValue(10);
            State state15 = this.b;
            if (zHasValue2) {
                state15.c = Integer.valueOf(ecv.a(10, context, typedArrayD).getDefaultColor());
            } else {
                int iIntValue = state15.d.intValue();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, dl30.z);
                typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
                ColorStateList colorStateListA = ecv.a(3, context, typedArrayObtainStyledAttributes);
                ecv.a(4, context, typedArrayObtainStyledAttributes);
                ecv.a(5, context, typedArrayObtainStyledAttributes);
                typedArrayObtainStyledAttributes.getInt(2, 0);
                typedArrayObtainStyledAttributes.getInt(1, 1);
                int i8 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
                typedArrayObtainStyledAttributes.getResourceId(i8, 0);
                typedArrayObtainStyledAttributes.getString(i8);
                typedArrayObtainStyledAttributes.getBoolean(14, false);
                ecv.a(6, context, typedArrayObtainStyledAttributes);
                typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
                typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, pk30.N);
                typedArrayObtainStyledAttributes2.hasValue(0);
                typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
                if (Build.VERSION.SDK_INT >= 26) {
                    typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
                }
                typedArrayObtainStyledAttributes2.recycle();
                this.b.c = Integer.valueOf(colorStateListA.getDefaultColor());
            }
        }
        State state16 = this.b;
        Integer num8 = state2.H;
        state16.H = Integer.valueOf(num8 == null ? typedArrayD.getInt(3, 8388661) : num8.intValue());
        State state17 = this.b;
        Integer num9 = state2.J;
        state17.J = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        State state18 = this.b;
        Integer num10 = state2.K;
        state18.K = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        State state19 = this.b;
        Integer num11 = state2.L;
        state19.L = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(19, 0) : num11.intValue());
        State state20 = this.b;
        Integer num12 = state2.M;
        state20.M = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(26, 0) : num12.intValue());
        State state21 = this.b;
        Integer num13 = state2.N;
        state21.N = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(20, state21.L.intValue()) : num13.intValue());
        State state22 = this.b;
        Integer num14 = state2.O;
        state22.O = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(27, state22.M.intValue()) : num14.intValue());
        State state23 = this.b;
        Integer num15 = state2.R;
        state23.R = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(21, 0) : num15.intValue());
        State state24 = this.b;
        Integer num16 = state2.P;
        state24.P = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        State state25 = this.b;
        Integer num17 = state2.Q;
        state25.Q = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        State state26 = this.b;
        Boolean bool2 = state2.S;
        state26.S = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(0, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = state2.C;
        State state27 = this.b;
        if (locale == null) {
            state27.C = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state27.C = locale;
        }
        this.a = state2;
    }
}
