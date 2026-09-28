package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class z14 {
    public final uti a;

    public z14(uti utiVar) {
        this.a = utiVar;
    }

    public static StringUiText a(long j, long j2) {
        long j3 = j - j2;
        if (j3 < 0) {
            j3 = 0;
        }
        String strA = w250.a(j3);
        StringUiText stringUiText = vch0.a;
        return new StringUiText(strA);
    }

    public static final ConcatUiText b(int i) {
        return new ConcatUiText(new UiText[]{vch0.d(String.valueOf(i)), new StringUiText("-"), new ResourceUiText(R.string.common_dates__days_lowercase)});
    }

    public static UiText c(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return c(w14.l);
        }
        int size = list.size();
        if (size == 1) {
            return b(((Number) list.get(0)).intValue());
        }
        if (size == 2) {
            return new ConcatUiText(new UiText[]{b(((Number) list.get(0)).intValue()), new StringUiText(" "), new ResourceUiText(R.string.common_functions__l_or), new StringUiText(" "), b(((Number) list.get(1)).intValue())});
        }
        List listP = CollectionsKt.P(list);
        ArrayList arrayList = new ArrayList(l48.r(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(b(((Number) it.next()).intValue()));
        }
        UiText[] uiTextArr = (UiText[]) arrayList.toArray(new UiText[0]);
        UiText[] uiTextArr2 = (UiText[]) Arrays.copyOf(uiTextArr, uiTextArr.length);
        StringUiText stringUiText = vch0.a;
        return new ConcatUiText(new UiText[]{new ConcatUiText(uiTextArr2, new StringUiText(", ")), new StringUiText(", "), new ResourceUiText(R.string.common_functions__l_or), new StringUiText(" "), b(((Number) CollectionsKt.b0(list)).intValue())});
    }

    public static s7e0 e(r7e0 r7e0Var) {
        int i;
        List listK = b.k(Integer.valueOf(R.string.common_dates__short2_sunday), Integer.valueOf(R.string.common_dates__short2_monday), Integer.valueOf(R.string.common_dates__short2_tuesday), Integer.valueOf(R.string.common_dates__short2_wednesday), Integer.valueOf(R.string.common_dates__short2_thursday), Integer.valueOf(R.string.common_dates__short2_friday), Integer.valueOf(R.string.common_dates__short2_saturday));
        ArrayList arrayList = r7e0Var.d;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int i4 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            o4e0 o4e0Var = (o4e0) obj;
            int iIntValue = ((Number) listK.get(i2)).intValue();
            int iOrdinal = o4e0Var.ordinal();
            if (iOrdinal == 0) {
                i = R.drawable.img__streak;
            } else if (iOrdinal == 1) {
                i = R.drawable.img__streak_break;
            } else if (iOrdinal == 2) {
                i = R.drawable.img__event_of_the_day;
            } else if (iOrdinal == 3) {
                i = R.drawable.img__upcoming_day;
            } else {
                if (iOrdinal != 4) {
                    uhc.a();
                    return null;
                }
                i = R.drawable.img__repaired_day;
            }
            arrayList2.add(new n4e0(iIntValue, i, o4e0Var));
            i2 = i4;
        }
        return new s7e0(a4h.b(arrayList2), r7e0Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0227  */
    /* JADX WARN: Code duplicated, block: B:110:0x022d  */
    /* JADX WARN: Code duplicated, block: B:111:0x022f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0233  */
    /* JADX WARN: Code duplicated, block: B:114:0x0241  */
    /* JADX WARN: Code duplicated, block: B:116:0x0249  */
    /* JADX WARN: Code duplicated, block: B:118:0x024f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0251  */
    /* JADX WARN: Code duplicated, block: B:121:0x0255  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:129:0x0300  */
    /* JADX WARN: Code duplicated, block: B:132:0x0307  */
    /* JADX WARN: Code duplicated, block: B:134:0x030b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0311  */
    /* JADX WARN: Code duplicated, block: B:139:0x0324  */
    /* JADX WARN: Code duplicated, block: B:143:0x0345  */
    /* JADX WARN: Code duplicated, block: B:145:0x0357  */
    /* JADX WARN: Code duplicated, block: B:146:0x0359  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:151:0x03af  */
    /* JADX WARN: Code duplicated, block: B:71:0x0196  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Instruction removed from duplicated block: B:134:0x030b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(w14 w14Var, long j, x1b x1bVar) {
        x14 x14Var;
        char c;
        Object next;
        b24 b24Var;
        int i;
        boolean z;
        CharSequence charSequence;
        s24 s24Var;
        int i2;
        int i3;
        Long l;
        StringUiText stringUiTextA;
        StringUiText stringUiText;
        int i4;
        String str;
        s24 s24Var2;
        UiText uiText;
        UiText uiText2;
        StringUiText stringUiTextD;
        Long l2;
        boolean z2;
        int i5;
        int i6;
        t6e0 t6e0Var;
        UiText uiText3;
        b24 b24Var2;
        int i7;
        Long l3;
        int i8;
        Object objG;
        String str2;
        int i9;
        t6e0 t6e0Var2;
        s24 s24Var3;
        UiText uiText4;
        UiText uiText5;
        Long l4;
        StringUiText stringUiText2;
        int i10;
        UiText uiText6;
        b24 b24Var3;
        r24 r24Var;
        Float f;
        ArrayList arrayList;
        boolean z3;
        boolean z4;
        w14 w14Var2 = w14Var;
        if (x1bVar instanceof x14) {
            x14Var = (x14) x1bVar;
            int i11 = x14Var.G;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x14Var.G = i11 - Integer.MIN_VALUE;
            } else {
                x14Var = new x14(this, x1bVar);
            }
        } else {
            x14Var = new x14(this, x1bVar);
        }
        x14 x14Var2 = x14Var;
        Object obj = x14Var2.E;
        y5b y5bVar = y5b.a;
        int i12 = x14Var2.G;
        String str3 = "x";
        if (i12 == 0) {
            c = 0;
            uj50.b(obj);
            List<b24> list = w14Var2.g;
            int i13 = w14Var2.f;
            String str4 = w14Var2.e;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                b24 b24Var4 = (b24) next;
                if (b24Var4.a != null && ((r24Var = b24Var4.b) == r24.Acceptable || r24Var == r24.InProgress)) {
                    break;
                }
            }
            b24Var = (b24) next;
            t6e0 t6e0Var3 = w14Var2.c;
            int iOrdinal = t6e0Var3.ordinal();
            if (iOrdinal == 0) {
                i = R.drawable.img__streak_level_0;
            } else if (iOrdinal == 1) {
                i = R.drawable.img__streak_level_1;
            } else if (iOrdinal == 2) {
                i = R.drawable.img__streak_level_2;
            } else if (iOrdinal == 3) {
                i = R.drawable.img__streak_level_3;
            } else if (iOrdinal == 4) {
                i = R.drawable.img__streak_level_4;
            } else {
                if (iOrdinal != 5) {
                    uhc.a();
                    return null;
                }
                i = R.drawable.img__streak_level_5;
            }
            int i14 = i;
            int i15 = w14Var2.b;
            double d = w14Var2.d;
            String strA = inm.a("x", d == 1.0d ? "1" : d == 0.0d ? "0" : String.valueOf(d));
            StringUiText stringUiText3 = vch0.a;
            StringUiText stringUiText4 = new StringUiText(strA);
            UiText resourceUiText = (StringsKt.U(str4) || str4.equals("0")) ? new ResourceUiText(R.string.page_loyalty__streak_boost_multiplier_description) : new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_loyalty__streak_boost_multiplier_description), new StringUiText(" "), new ResourceUiText(R.string.page_loyalty__max_loyalty_reward_note, ay0.S(new Object[]{str4}))});
            UiText resourceUiText2 = (StringsKt.U(str4) || str4.equals("0")) ? new ResourceUiText(R.string.page_loyalty__streak_rewards_boost_info_description) : new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_loyalty__streak_rewards_boost_info_description), new StringUiText(" "), new ResourceUiText(R.string.page_loyalty__max_streak_boost_note, ay0.S(new Object[]{str4}))});
            String strValueOf = String.valueOf(i13);
            if (i13 <= 0) {
                z = false;
                break;
            }
            ArrayList arrayList2 = w14Var2.h;
            if (arrayList2.isEmpty()) {
                z = false;
                break;
            }
            int size = arrayList2.size();
            int i16 = 0;
            loop2: while (true) {
                if (i16 >= size) {
                    z = false;
                    break;
                }
                Object obj2 = arrayList2.get(i16);
                int i17 = i16 + 1;
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = ((r7e0) obj2).d;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj3 = arrayList4.get(i18);
                        i18++;
                        ArrayList arrayList5 = arrayList4;
                        o4e0 o4e0Var = (o4e0) obj3;
                        int i19 = size2;
                        if (o4e0Var == o4e0.b) {
                            z = true;
                            break loop2;
                        }
                        size2 = i19;
                        arrayList4 = arrayList5;
                    }
                }
                size = size;
                arrayList2 = arrayList3;
                i16 = i17;
            }
            UiText uiTextC = c(w14Var2.k);
            int i20 = b24Var != null ? 1 : 0;
            charSequence = " ";
            if (b24Var == null || (s24Var = b24Var.a) == null) {
                s24Var = s24.PlacingWager;
            }
            if (b24Var != null) {
                b24 b24Var5 = b24Var.b == r24.InProgress ? b24Var : null;
                i2 = i14;
                i3 = i15;
                l = b24Var5 != null ? new Long(b24Var5.c) : null;
                if (b24Var == null) {
                    stringUiTextA = null;
                } else {
                    if (b24Var.b == r24.InProgress) {
                        b24Var3 = b24Var;
                    } else {
                        b24Var3 = null;
                    }
                    if (b24Var3 != null) {
                        stringUiTextA = a(b24Var3.c, j);
                    } else {
                        stringUiTextA = null;
                    }
                }
                if (b24Var != null) {
                    if (b24Var.b == r24.InProgress) {
                        b24Var2 = b24Var;
                    } else {
                        b24Var2 = null;
                    }
                    if (b24Var2 != null) {
                        String strValueOf2 = String.valueOf(b24Var2.e);
                        String str5 = b24Var2.f;
                        x14Var2.a = w14Var2;
                        x14Var2.b = b24Var;
                        x14Var2.c = t6e0Var3;
                        x14Var2.d = stringUiText4;
                        x14Var2.e = resourceUiText;
                        x14Var2.f = resourceUiText2;
                        x14Var2.i = strValueOf;
                        x14Var2.v = uiTextC;
                        x14Var2.w = s24Var;
                        x14Var2.y = l;
                        x14Var2.z = stringUiTextA;
                        x14Var2.A = i2;
                        i7 = i3;
                        x14Var2.B = i7;
                        l3 = l;
                        x14Var2.D = z;
                        x14Var2.C = i20;
                        x14Var2.G = 1;
                        i8 = i20;
                        objG = uti.g(this.a, strValueOf2, str5, false, x14Var2, 28);
                        if (objG == y5bVar) {
                            return y5bVar;
                        }
                        str2 = strValueOf;
                        i9 = i2;
                        t6e0Var2 = t6e0Var3;
                        s24Var3 = s24Var;
                        uiText4 = uiTextC;
                        uiText5 = resourceUiText2;
                        l4 = l3;
                        stringUiText2 = stringUiText4;
                        i10 = i7;
                        uiText6 = resourceUiText;
                    }
                    StringUiText stringUiText5 = stringUiTextA;
                    if (b24Var == null) {
                        f = null;
                    } else {
                        if (b24Var.b != r24.InProgress) {
                            b24Var = null;
                        }
                        if (b24Var != null) {
                            int i21 = b24Var.e;
                            f = new Float(i21 > 0 ? f.d(((float) b24Var.d) / i21, 0.0f, 1.0f) : 0.0f);
                        } else {
                            f = null;
                        }
                    }
                    qcn qcnVarB = a4h.b(w14Var2.h);
                    boolean z5 = w14Var2.i;
                    List<a7e0> list2 = w14Var2.j;
                    arrayList = new ArrayList(l48.r(list2, 10));
                    for (a7e0 a7e0Var : list2) {
                        if (w14Var2.c.a >= a7e0Var.a.a) {
                            z4 = 1;
                        } else {
                            z4 = c;
                        }
                        StringUiText stringUiTextD2 = vch0.d(String.valueOf(a7e0Var.b));
                        StringUiText stringUiText6 = new StringUiText(charSequence);
                        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_dates__days_lowercase);
                        UiText[] uiTextArr = new UiText[3];
                        uiTextArr[c] = stringUiTextD2;
                        uiTextArr[1] = stringUiText6;
                        uiTextArr[2] = resourceUiText3;
                        arrayList.add(new r3e0(z4, new ConcatUiText(uiTextArr), new StringUiText(str3 + a7e0Var.c)));
                    }
                    qcn qcnVarB2 = a4h.b(arrayList);
                    if (i5 != 0) {
                        z3 = 1;
                    } else {
                        z3 = c;
                    }
                    return new n7e0(t6e0Var, i6, i4, stringUiText, uiText3, uiText2, str, z2, uiText, z3, s24Var2, l2, stringUiText5, stringUiTextD, f, qcnVarB, z5, qcnVarB2, 1900544);
                }
                stringUiText = stringUiText4;
                i4 = i3;
                str = strValueOf;
                s24Var2 = s24Var;
                uiText = uiTextC;
                uiText2 = resourceUiText2;
                stringUiTextD = null;
                l2 = l;
                z2 = z;
                i5 = i20;
                i6 = i2;
                t6e0Var = t6e0Var3;
                uiText3 = resourceUiText;
                StringUiText stringUiText7 = stringUiTextA;
                if (b24Var == null) {
                    f = null;
                } else {
                    if (b24Var.b != r24.InProgress) {
                        b24Var = null;
                    }
                    if (b24Var != null) {
                        int i22 = b24Var.e;
                        f = new Float(i22 > 0 ? f.d(((float) b24Var.d) / i22, 0.0f, 1.0f) : 0.0f);
                    } else {
                        f = null;
                    }
                }
                qcn qcnVarB3 = a4h.b(w14Var2.h);
                boolean z6 = w14Var2.i;
                List<a7e0> list3 = w14Var2.j;
                arrayList = new ArrayList(l48.r(list3, 10));
                while (r2.hasNext()) {
                    if (w14Var2.c.a >= a7e0Var.a.a) {
                        z4 = 1;
                    } else {
                        z4 = c;
                    }
                    StringUiText stringUiTextD3 = vch0.d(String.valueOf(a7e0Var.b));
                    StringUiText stringUiText8 = new StringUiText(charSequence);
                    ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_dates__days_lowercase);
                    UiText[] uiTextArr2 = new UiText[3];
                    uiTextArr2[c] = stringUiTextD3;
                    uiTextArr2[1] = stringUiText8;
                    uiTextArr2[2] = resourceUiText4;
                    arrayList.add(new r3e0(z4, new ConcatUiText(uiTextArr2), new StringUiText(str3 + a7e0Var.c)));
                }
                qcn qcnVarB4 = a4h.b(arrayList);
                if (i5 != 0) {
                    z3 = 1;
                } else {
                    z3 = c;
                }
                return new n7e0(t6e0Var, i6, i4, stringUiText, uiText3, uiText2, str, z2, uiText, z3, s24Var2, l2, stringUiText7, stringUiTextD, f, qcnVarB3, z6, qcnVarB4, 1900544);
            }
            i2 = i14;
            i3 = i15;
            if (b24Var == null) {
                stringUiTextA = null;
            } else {
                if (b24Var.b == r24.InProgress) {
                    b24Var3 = b24Var;
                } else {
                    b24Var3 = null;
                }
                if (b24Var3 != null) {
                    stringUiTextA = a(b24Var3.c, j);
                } else {
                    stringUiTextA = null;
                }
            }
            if (b24Var != null) {
                if (b24Var.b == r24.InProgress) {
                    b24Var2 = b24Var;
                } else {
                    b24Var2 = null;
                }
                if (b24Var2 != null) {
                    String strValueOf3 = String.valueOf(b24Var2.e);
                    String str6 = b24Var2.f;
                    x14Var2.a = w14Var2;
                    x14Var2.b = b24Var;
                    x14Var2.c = t6e0Var3;
                    x14Var2.d = stringUiText4;
                    x14Var2.e = resourceUiText;
                    x14Var2.f = resourceUiText2;
                    x14Var2.i = strValueOf;
                    x14Var2.v = uiTextC;
                    x14Var2.w = s24Var;
                    x14Var2.y = l;
                    x14Var2.z = stringUiTextA;
                    x14Var2.A = i2;
                    i7 = i3;
                    x14Var2.B = i7;
                    l3 = l;
                    x14Var2.D = z;
                    x14Var2.C = i20;
                    x14Var2.G = 1;
                    i8 = i20;
                    objG = uti.g(this.a, strValueOf3, str6, false, x14Var2, 28);
                    if (objG == y5bVar) {
                        return y5bVar;
                    }
                    str2 = strValueOf;
                    i9 = i2;
                    t6e0Var2 = t6e0Var3;
                    s24Var3 = s24Var;
                    uiText4 = uiTextC;
                    uiText5 = resourceUiText2;
                    l4 = l3;
                    stringUiText2 = stringUiText4;
                    i10 = i7;
                    uiText6 = resourceUiText;
                }
                StringUiText stringUiText9 = stringUiTextA;
                if (b24Var == null) {
                    f = null;
                } else {
                    if (b24Var.b != r24.InProgress) {
                        b24Var = null;
                    }
                    if (b24Var != null) {
                        int i23 = b24Var.e;
                        f = new Float(i23 > 0 ? f.d(((float) b24Var.d) / i23, 0.0f, 1.0f) : 0.0f);
                    } else {
                        f = null;
                    }
                }
                qcn qcnVarB5 = a4h.b(w14Var2.h);
                boolean z7 = w14Var2.i;
                List<a7e0> list4 = w14Var2.j;
                arrayList = new ArrayList(l48.r(list4, 10));
                while (r2.hasNext()) {
                    if (w14Var2.c.a >= a7e0Var.a.a) {
                        z4 = 1;
                    } else {
                        z4 = c;
                    }
                    StringUiText stringUiTextD4 = vch0.d(String.valueOf(a7e0Var.b));
                    StringUiText stringUiText10 = new StringUiText(charSequence);
                    ResourceUiText resourceUiText5 = new ResourceUiText(R.string.common_dates__days_lowercase);
                    UiText[] uiTextArr3 = new UiText[3];
                    uiTextArr3[c] = stringUiTextD4;
                    uiTextArr3[1] = stringUiText10;
                    uiTextArr3[2] = resourceUiText5;
                    arrayList.add(new r3e0(z4, new ConcatUiText(uiTextArr3), new StringUiText(str3 + a7e0Var.c)));
                }
                qcn qcnVarB6 = a4h.b(arrayList);
                if (i5 != 0) {
                    z3 = 1;
                } else {
                    z3 = c;
                }
                return new n7e0(t6e0Var, i6, i4, stringUiText, uiText3, uiText2, str, z2, uiText, z3, s24Var2, l2, stringUiText9, stringUiTextD, f, qcnVarB5, z7, qcnVarB6, 1900544);
            }
            stringUiText = stringUiText4;
            i4 = i3;
            str = strValueOf;
            s24Var2 = s24Var;
            uiText = uiTextC;
            uiText2 = resourceUiText2;
            stringUiTextD = null;
            l2 = l;
            z2 = z;
            i5 = i20;
            i6 = i2;
            t6e0Var = t6e0Var3;
            uiText3 = resourceUiText;
            StringUiText stringUiText11 = stringUiTextA;
            if (b24Var == null) {
                f = null;
            } else {
                if (b24Var.b != r24.InProgress) {
                    b24Var = null;
                }
                if (b24Var != null) {
                    int i24 = b24Var.e;
                    f = new Float(i24 > 0 ? f.d(((float) b24Var.d) / i24, 0.0f, 1.0f) : 0.0f);
                } else {
                    f = null;
                }
            }
            qcn qcnVarB7 = a4h.b(w14Var2.h);
            boolean z8 = w14Var2.i;
            List<a7e0> list5 = w14Var2.j;
            arrayList = new ArrayList(l48.r(list5, 10));
            while (r2.hasNext()) {
                if (w14Var2.c.a >= a7e0Var.a.a) {
                    z4 = 1;
                } else {
                    z4 = c;
                }
                StringUiText stringUiTextD5 = vch0.d(String.valueOf(a7e0Var.b));
                StringUiText stringUiText12 = new StringUiText(charSequence);
                ResourceUiText resourceUiText6 = new ResourceUiText(R.string.common_dates__days_lowercase);
                UiText[] uiTextArr4 = new UiText[3];
                uiTextArr4[c] = stringUiTextD5;
                uiTextArr4[1] = stringUiText12;
                uiTextArr4[2] = resourceUiText6;
                arrayList.add(new r3e0(z4, new ConcatUiText(uiTextArr4), new StringUiText(str3 + a7e0Var.c)));
            }
            qcn qcnVarB8 = a4h.b(arrayList);
            if (i5 != 0) {
                z3 = 1;
            } else {
                z3 = c;
            }
            return new n7e0(t6e0Var, i6, i4, stringUiText, uiText3, uiText2, str, z2, uiText, z3, s24Var2, l2, stringUiText11, stringUiTextD, f, qcnVarB7, z8, qcnVarB8, 1900544);
        }
        if (i12 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i25 = x14Var2.C;
        boolean z9 = x14Var2.D;
        i10 = x14Var2.B;
        int i26 = x14Var2.A;
        StringUiText stringUiText13 = x14Var2.z;
        l4 = x14Var2.y;
        s24Var3 = x14Var2.w;
        uiText4 = x14Var2.v;
        c = 0;
        String str7 = x14Var2.i;
        uiText5 = x14Var2.f;
        uiText6 = x14Var2.e;
        stringUiText2 = x14Var2.d;
        t6e0 t6e0Var4 = x14Var2.c;
        b24 b24Var6 = x14Var2.b;
        w14 w14Var3 = x14Var2.a;
        uj50.b(obj);
        i8 = i25;
        z = z9;
        w14Var2 = w14Var3;
        str3 = "x";
        charSequence = " ";
        str2 = str7;
        stringUiTextA = stringUiText13;
        i9 = i26;
        objG = obj;
        b24Var = b24Var6;
        t6e0Var2 = t6e0Var4;
        t6e0Var = t6e0Var2;
        i4 = i10;
        stringUiTextD = vch0.d((CharSequence) objG);
        l2 = l4;
        s24Var2 = s24Var3;
        str = str2;
        uiText = uiText4;
        uiText2 = uiText5;
        stringUiText = stringUiText2;
        z2 = z;
        i5 = i8;
        i6 = i9;
        uiText3 = uiText6;
        StringUiText stringUiText14 = stringUiTextA;
        if (b24Var == null) {
            f = null;
        } else {
            if (b24Var.b != r24.InProgress) {
                b24Var = null;
            }
            if (b24Var != null) {
                int i27 = b24Var.e;
                f = new Float(i27 > 0 ? f.d(((float) b24Var.d) / i27, 0.0f, 1.0f) : 0.0f);
            } else {
                f = null;
            }
        }
        qcn qcnVarB9 = a4h.b(w14Var2.h);
        boolean z10 = w14Var2.i;
        List<a7e0> list6 = w14Var2.j;
        arrayList = new ArrayList(l48.r(list6, 10));
        while (r2.hasNext()) {
            if (w14Var2.c.a >= a7e0Var.a.a) {
                z4 = 1;
            } else {
                z4 = c;
            }
            StringUiText stringUiTextD6 = vch0.d(String.valueOf(a7e0Var.b));
            StringUiText stringUiText15 = new StringUiText(charSequence);
            ResourceUiText resourceUiText7 = new ResourceUiText(R.string.common_dates__days_lowercase);
            UiText[] uiTextArr5 = new UiText[3];
            uiTextArr5[c] = stringUiTextD6;
            uiTextArr5[1] = stringUiText15;
            uiTextArr5[2] = resourceUiText7;
            arrayList.add(new r3e0(z4, new ConcatUiText(uiTextArr5), new StringUiText(str3 + a7e0Var.c)));
        }
        qcn qcnVarB10 = a4h.b(arrayList);
        if (i5 != 0) {
            z3 = 1;
        } else {
            z3 = c;
        }
        return new n7e0(t6e0Var, i6, i4, stringUiText, uiText3, uiText2, str, z2, uiText, z3, s24Var2, l2, stringUiText14, stringUiTextD, f, qcnVarB9, z10, qcnVarB10, 1900544);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0110, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(n7e0 n7e0Var, List list, long j, x1b x1bVar) {
        y14 y14Var;
        Object next;
        b24 b24Var;
        s24 s24Var;
        Long l;
        StringUiText stringUiTextA;
        n7e0 n7e0Var2;
        StringUiText stringUiTextD;
        boolean z;
        s24 s24Var2;
        Long l2;
        StringUiText stringUiText;
        b24 b24Var2;
        s24 s24Var3;
        Long l3;
        StringUiText stringUiText2;
        int i;
        r24 r24Var;
        if (x1bVar instanceof y14) {
            y14Var = (y14) x1bVar;
            int i2 = y14Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y14Var.w = i2 - Integer.MIN_VALUE;
            } else {
                y14Var = new y14(this, x1bVar);
            }
        } else {
            y14Var = new y14(this, x1bVar);
        }
        y14 y14Var2 = y14Var;
        Object obj = y14Var2.i;
        y5b y5bVar = y5b.a;
        int i3 = y14Var2.w;
        Float f = null;
        if (i3 == 0) {
            uj50.b(obj);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                b24 b24Var3 = (b24) next;
                if (b24Var3.a != null && ((r24Var = b24Var3.b) == r24.Acceptable || r24Var == r24.InProgress)) {
                    break;
                }
            }
            b24Var = (b24) next;
            int i4 = b24Var != null ? 1 : 0;
            if (b24Var == null || (s24Var = b24Var.a) == null) {
                s24Var = s24.PlacingWager;
            }
            s24 s24Var4 = s24Var;
            if (b24Var == null) {
                l = null;
            } else {
                b24 b24Var4 = b24Var.b == r24.InProgress ? b24Var : null;
                if (b24Var4 != null) {
                    l = new Long(b24Var4.c);
                } else {
                    l = null;
                }
            }
            if (b24Var == null) {
                stringUiTextA = null;
            } else {
                b24 b24Var5 = b24Var.b == r24.InProgress ? b24Var : null;
                if (b24Var5 != null) {
                    stringUiTextA = a(b24Var5.c, j);
                } else {
                    stringUiTextA = null;
                }
            }
            if (b24Var != null) {
                b24 b24Var6 = b24Var.b == r24.InProgress ? b24Var : null;
                if (b24Var6 != null) {
                    String strValueOf = String.valueOf(b24Var6.e);
                    String str = b24Var6.f;
                    y14Var2.a = b24Var;
                    n7e0Var2 = n7e0Var;
                    y14Var2.b = n7e0Var2;
                    y14Var2.c = s24Var4;
                    y14Var2.d = l;
                    y14Var2.e = stringUiTextA;
                    y14Var2.f = i4;
                    y14Var2.w = 1;
                    Object objG = uti.g(this.a, strValueOf, str, false, y14Var2, 28);
                    if (objG == y5bVar) {
                        return y5bVar;
                    }
                    b24Var2 = b24Var;
                    s24Var3 = s24Var4;
                    l3 = l;
                    stringUiText2 = stringUiTextA;
                    obj = objG;
                    i = i4;
                }
                n7e0 n7e0Var3 = n7e0Var2;
                if (b24Var != null) {
                    if (b24Var.b != r24.InProgress) {
                        b24Var = null;
                    }
                    if (b24Var != null) {
                        int i5 = b24Var.e;
                        f = new Float(i5 > 0 ? f.d(((float) b24Var.d) / i5, 0.0f, 1.0f) : 0.0f);
                    }
                }
                return n7e0.a(n7e0Var3, z, s24Var2, l2, stringUiText, stringUiTextD, f, false, false, null, false, false, 4162047);
            }
            n7e0Var2 = n7e0Var;
            stringUiTextD = null;
            z = i4;
            s24Var2 = s24Var4;
            l2 = l;
            stringUiText = stringUiTextA;
            n7e0 n7e0Var4 = n7e0Var2;
            if (b24Var != null) {
                if (b24Var.b != r24.InProgress) {
                    b24Var = null;
                }
                if (b24Var != null) {
                    int i6 = b24Var.e;
                    f = new Float(i6 > 0 ? f.d(((float) b24Var.d) / i6, 0.0f, 1.0f) : 0.0f);
                }
            }
            return n7e0.a(n7e0Var4, z, s24Var2, l2, stringUiText, stringUiTextD, f, false, false, null, false, false, 4162047);
        }
        if (i3 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = y14Var2.f;
        stringUiText2 = y14Var2.e;
        l3 = y14Var2.d;
        s24Var3 = y14Var2.c;
        n7e0 n7e0Var5 = y14Var2.b;
        b24Var2 = y14Var2.a;
        uj50.b(obj);
        n7e0Var2 = n7e0Var5;
        z = i;
        stringUiTextD = vch0.d((CharSequence) obj);
        stringUiText = stringUiText2;
        l2 = l3;
        s24Var2 = s24Var3;
        b24Var = b24Var2;
        n7e0 n7e0Var6 = n7e0Var2;
        if (b24Var != null) {
            if (b24Var.b != r24.InProgress) {
                b24Var = null;
            }
            if (b24Var != null) {
                int i7 = b24Var.e;
                f = new Float(i7 > 0 ? f.d(((float) b24Var.d) / i7, 0.0f, 1.0f) : 0.0f);
            }
        }
        return n7e0.a(n7e0Var6, z, s24Var2, l2, stringUiText, stringUiTextD, f, false, false, null, false, false, 4162047);
    }
}
