package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Reader;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kuk extends saj implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuk(Object obj, int i) {
        super(1, obj, hvk.class, "handleUiAction", "handleUiAction(Lcom/sportybet/android/instantwin/presentation/gift/model/giftselector/GiftSelectorUiAction;)V", 0);
        this.a = i;
        switch (i) {
            case 1:
                super(1, obj, fpb0.class, "handleListScrollInProgressChanged", "handleListScrollInProgressChanged(Z)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x0160  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ba8 ba8Var;
        final xlp xlpVar;
        xlp xlpVar2;
        Integer numValueOf;
        switch (this.a) {
            case 0:
                lvk lvkVar = (lvk) obj;
                lvkVar.getClass();
                ((hvk) this.receiver).b(lvkVar);
                return Unit.a;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                fpb0 fpb0Var = (fpb0) this.receiver;
                if (fpb0Var.q != zBooleanValue) {
                    fpb0Var.q = zBooleanValue;
                    fpb0Var.g.invoke(bool);
                }
                return Unit.a;
            default:
                KeyEvent keyEvent = ((cmp) obj).a;
                final bhf0 bhf0Var = (bhf0) this.receiver;
                tlf0 tlf0Var = bhf0Var.f;
                boolean z = bhf0Var.d;
                xlp xlpVar3 = null;
                boolean z2 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    ba8Var = null;
                } else {
                    yzc yzcVar = bhf0Var.i;
                    yzcVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        yzcVar.a = Integer.valueOf(unicodeChar & Reader.READ_DONE);
                        numValueOf = null;
                    } else {
                        Integer num = yzcVar.a;
                        if (num != null) {
                            yzcVar.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        ba8Var = new ba8(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        ba8Var = null;
                    }
                }
                if (ba8Var != null) {
                    if (z) {
                        bhf0Var.a(a.c(ba8Var));
                        tlf0Var.a = null;
                    } else {
                        z2 = false;
                    }
                } else if (emp.b(keyEvent) == 2) {
                    bhf0Var.j.getClass();
                    if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                        long jB = qnp.b(keyEvent.getKeyCode());
                        if (olp.a(jB, apu.i)) {
                            xlpVar = xlp.SELECT_LINE_LEFT;
                        } else if (olp.a(jB, apu.j)) {
                            xlpVar = xlp.SELECT_LINE_RIGHT;
                        } else if (olp.a(jB, apu.k)) {
                            xlpVar = xlp.SELECT_HOME;
                        } else if (olp.a(jB, apu.l)) {
                            xlpVar = xlp.SELECT_END;
                        } else {
                            xlpVar = null;
                        }
                    } else if (keyEvent.isAltPressed()) {
                        long jB2 = qnp.b(keyEvent.getKeyCode());
                        if (olp.a(jB2, apu.i)) {
                            xlpVar = xlp.LINE_LEFT;
                        } else if (olp.a(jB2, apu.j)) {
                            xlpVar = xlp.LINE_RIGHT;
                        } else if (olp.a(jB2, apu.k)) {
                            xlpVar = xlp.HOME;
                        } else if (olp.a(jB2, apu.l)) {
                            xlpVar = xlp.END;
                        } else {
                            xlpVar = null;
                        }
                    } else {
                        xlpVar = null;
                    }
                    if (xlpVar == null) {
                        nmp.b bVar = nmp.a;
                        bVar.getClass();
                        if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                            long jB3 = qnp.b(keyEvent.getKeyCode());
                            if (olp.a(jB3, apu.i)) {
                                xlpVar2 = xlp.SELECT_LEFT_WORD;
                            } else if (olp.a(jB3, apu.j)) {
                                xlpVar2 = xlp.SELECT_RIGHT_WORD;
                            } else if (olp.a(jB3, apu.k)) {
                                xlpVar2 = xlp.SELECT_PREV_PARAGRAPH;
                            } else if (olp.a(jB3, apu.l)) {
                                xlpVar2 = xlp.SELECT_NEXT_PARAGRAPH;
                            } else {
                                xlpVar2 = null;
                            }
                        } else if (keyEvent.isCtrlPressed()) {
                            long jB4 = qnp.b(keyEvent.getKeyCode());
                            if (olp.a(jB4, apu.i)) {
                                xlpVar2 = xlp.LEFT_WORD;
                            } else if (olp.a(jB4, apu.j)) {
                                xlpVar2 = xlp.RIGHT_WORD;
                            } else if (olp.a(jB4, apu.k)) {
                                xlpVar2 = xlp.PREV_PARAGRAPH;
                            } else if (olp.a(jB4, apu.l)) {
                                xlpVar2 = xlp.NEXT_PARAGRAPH;
                            } else if (olp.a(jB4, apu.c)) {
                                xlpVar2 = xlp.DELETE_PREV_CHAR;
                            } else if (olp.a(jB4, apu.v)) {
                                xlpVar2 = xlp.DELETE_NEXT_WORD;
                            } else if (olp.a(jB4, apu.u)) {
                                xlpVar2 = xlp.DELETE_PREV_WORD;
                            } else if (olp.a(jB4, apu.h)) {
                                xlpVar2 = xlp.DESELECT;
                            } else {
                                xlpVar2 = null;
                            }
                        } else if (keyEvent.isShiftPressed()) {
                            long jB5 = qnp.b(keyEvent.getKeyCode());
                            if (olp.a(jB5, apu.p)) {
                                xlpVar2 = xlp.SELECT_LINE_START;
                            } else if (olp.a(jB5, apu.q)) {
                                xlpVar2 = xlp.SELECT_LINE_END;
                            } else {
                                xlpVar2 = null;
                            }
                        } else if (keyEvent.isAltPressed()) {
                            long jB6 = qnp.b(keyEvent.getKeyCode());
                            if (olp.a(jB6, apu.u)) {
                                xlpVar2 = xlp.DELETE_FROM_LINE_START;
                            } else if (olp.a(jB6, apu.v)) {
                                xlpVar2 = xlp.DELETE_TO_LINE_END;
                            } else {
                                xlpVar2 = null;
                            }
                        } else {
                            xlpVar2 = null;
                        }
                        if (xlpVar2 == null) {
                            Function1 function1 = (Function1) bVar.a.a;
                            if (((Boolean) function1.invoke(new cmp(keyEvent))).booleanValue() && keyEvent.isShiftPressed()) {
                                long jB7 = qnp.b(keyEvent.getKeyCode());
                                int i = apu.A;
                                if (olp.a(jB7, apu.g)) {
                                    xlpVar3 = xlp.REDO;
                                }
                            } else if (((Boolean) function1.invoke(new cmp(keyEvent))).booleanValue()) {
                                long jA = emp.a(keyEvent);
                                int i2 = apu.A;
                                if (olp.a(jA, apu.b) || olp.a(jA, apu.r)) {
                                    xlpVar3 = xlp.COPY;
                                } else if (olp.a(jA, apu.d)) {
                                    xlpVar3 = xlp.PASTE;
                                } else if (olp.a(jA, apu.f)) {
                                    xlpVar3 = xlp.CUT;
                                } else if (olp.a(jA, apu.a)) {
                                    xlpVar3 = xlp.SELECT_ALL;
                                } else if (olp.a(jA, apu.e)) {
                                    xlpVar3 = xlp.REDO;
                                } else if (olp.a(jA, apu.g)) {
                                    xlpVar3 = xlp.UNDO;
                                }
                            } else if (!keyEvent.isCtrlPressed()) {
                                if (keyEvent.isShiftPressed()) {
                                    long jB8 = qnp.b(keyEvent.getKeyCode());
                                    int i3 = apu.A;
                                    if (olp.a(jB8, apu.i)) {
                                        xlpVar3 = xlp.SELECT_LEFT_CHAR;
                                    } else if (olp.a(jB8, apu.j)) {
                                        xlpVar3 = xlp.SELECT_RIGHT_CHAR;
                                    } else if (olp.a(jB8, apu.k)) {
                                        xlpVar3 = xlp.SELECT_UP;
                                    } else if (olp.a(jB8, apu.l)) {
                                        xlpVar3 = xlp.SELECT_DOWN;
                                    } else if (olp.a(jB8, apu.n)) {
                                        xlpVar3 = xlp.SELECT_PAGE_UP;
                                    } else if (olp.a(jB8, apu.o)) {
                                        xlpVar3 = xlp.SELECT_PAGE_DOWN;
                                    } else if (olp.a(jB8, apu.p)) {
                                        xlpVar3 = xlp.SELECT_LINE_START;
                                    } else if (olp.a(jB8, apu.q)) {
                                        xlpVar3 = xlp.SELECT_LINE_END;
                                    } else if (olp.a(jB8, apu.r)) {
                                        xlpVar3 = xlp.PASTE;
                                    }
                                } else {
                                    long jB9 = qnp.b(keyEvent.getKeyCode());
                                    int i4 = apu.A;
                                    if (olp.a(jB9, apu.i)) {
                                        xlpVar3 = xlp.LEFT_CHAR;
                                    } else if (olp.a(jB9, apu.j)) {
                                        xlpVar3 = xlp.RIGHT_CHAR;
                                    } else if (olp.a(jB9, apu.k)) {
                                        xlpVar3 = xlp.UP;
                                    } else if (olp.a(jB9, apu.l)) {
                                        xlpVar3 = xlp.DOWN;
                                    } else if (olp.a(jB9, apu.m)) {
                                        xlpVar3 = xlp.CENTER;
                                    } else if (olp.a(jB9, apu.n)) {
                                        xlpVar3 = xlp.PAGE_UP;
                                    } else if (olp.a(jB9, apu.o)) {
                                        xlpVar3 = xlp.PAGE_DOWN;
                                    } else if (olp.a(jB9, apu.p)) {
                                        xlpVar3 = xlp.LINE_START;
                                    } else if (olp.a(jB9, apu.q)) {
                                        xlpVar3 = xlp.LINE_END;
                                    } else if (olp.a(jB9, apu.s) || olp.a(jB9, apu.t)) {
                                        xlpVar3 = xlp.NEW_LINE;
                                    } else if (olp.a(jB9, apu.u)) {
                                        xlpVar3 = xlp.DELETE_PREV_CHAR;
                                    } else if (olp.a(jB9, apu.v)) {
                                        xlpVar3 = xlp.DELETE_NEXT_CHAR;
                                    } else if (olp.a(jB9, apu.w)) {
                                        xlpVar3 = xlp.PASTE;
                                    } else if (olp.a(jB9, apu.x)) {
                                        xlpVar3 = xlp.CUT;
                                    } else if (olp.a(jB9, apu.y)) {
                                        xlpVar3 = xlp.COPY;
                                    } else if (olp.a(jB9, apu.z)) {
                                        xlpVar3 = xlp.TAB;
                                    }
                                }
                            }
                            xlpVar = xlpVar3;
                        } else {
                            xlpVar = xlpVar2;
                        }
                    }
                    if (xlpVar == null || (xlpVar.a && !z)) {
                        z2 = false;
                    } else {
                        final yp40 yp40Var = new yp40();
                        yp40Var.a = true;
                        Function1 function2 = new Function1() { // from class: xgf0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Integer numC;
                                Integer numD;
                                Integer numD2;
                                Integer numC2;
                                ukf0 ukf0Var;
                                ukf0 ukf0Var2;
                                vkf0 vkf0Var;
                                vkf0 vkf0Var2;
                                Integer numC3;
                                Integer numD3;
                                Integer numD4;
                                Integer numC4;
                                ukf0 ukf0Var3;
                                ukf0 ukf0Var4;
                                vkf0 vkf0Var3;
                                vkf0 vkf0Var4;
                                odh0.a aVar;
                                nhf0 nhf0Var = (nhf0) obj2;
                                int i5 = bhf0.a.a[xlpVar.ordinal()];
                                bhf0 bhf0Var2 = bhf0Var;
                                yp40 yp40Var2 = yp40Var;
                                ijf0 ijf0Var = null;
                                switch (i5) {
                                    case 1:
                                        bhf0Var2.b.a(false);
                                        break;
                                    case 2:
                                        bhf0Var2.b.n();
                                        break;
                                    case 3:
                                        bhf0Var2.b.c();
                                        break;
                                    case 4:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            if (!ulf0.c(nhf0Var.f)) {
                                                boolean zE = nhf0Var.e();
                                                long j = nhf0Var.f;
                                                if (!zE) {
                                                    int iE = ulf0.e(j);
                                                    nhf0Var.o(iE, iE);
                                                } else {
                                                    int iF = ulf0.f(j);
                                                    nhf0Var.o(iF, iF);
                                                }
                                            } else {
                                                nhf0Var.g();
                                                Unit unit = Unit.a;
                                            }
                                        }
                                        break;
                                    case 5:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            if (!ulf0.c(nhf0Var.f)) {
                                                boolean zE2 = nhf0Var.e();
                                                long j2 = nhf0Var.f;
                                                if (!zE2) {
                                                    int iF2 = ulf0.f(j2);
                                                    nhf0Var.o(iF2, iF2);
                                                } else {
                                                    int iE2 = ulf0.e(j2);
                                                    nhf0Var.o(iE2, iE2);
                                                }
                                            } else {
                                                nhf0Var.k();
                                                Unit unit2 = Unit.a;
                                            }
                                        }
                                        break;
                                    case 6:
                                        tlf0 tlf0Var2 = nhf0Var.e;
                                        tlf0Var2.a = null;
                                        nk0 nk0Var = nhf0Var.g;
                                        String str = nk0Var.b;
                                        String str2 = nk0Var.b;
                                        if (str.length() > 0) {
                                            if (!nhf0Var.e()) {
                                                tlf0Var2.a = null;
                                                if (str2.length() > 0 && (numC = nhf0Var.c()) != null) {
                                                    int iIntValue = numC.intValue();
                                                    nhf0Var.o(iIntValue, iIntValue);
                                                }
                                            } else {
                                                tlf0Var2.a = null;
                                                if (str2.length() > 0 && (numD = nhf0Var.d()) != null) {
                                                    int iIntValue2 = numD.intValue();
                                                    nhf0Var.o(iIntValue2, iIntValue2);
                                                }
                                            }
                                        }
                                        break;
                                    case 7:
                                        tlf0 tlf0Var3 = nhf0Var.e;
                                        tlf0Var3.a = null;
                                        nk0 nk0Var2 = nhf0Var.g;
                                        String str3 = nk0Var2.b;
                                        String str4 = nk0Var2.b;
                                        if (str3.length() > 0) {
                                            if (!nhf0Var.e()) {
                                                tlf0Var3.a = null;
                                                if (str4.length() > 0 && (numD2 = nhf0Var.d()) != null) {
                                                    int iIntValue3 = numD2.intValue();
                                                    nhf0Var.o(iIntValue3, iIntValue3);
                                                }
                                            } else {
                                                tlf0Var3.a = null;
                                                if (str4.length() > 0 && (numC2 = nhf0Var.c()) != null) {
                                                    int iIntValue4 = numC2.intValue();
                                                    nhf0Var.o(iIntValue4, iIntValue4);
                                                }
                                            }
                                        }
                                        break;
                                    case 8:
                                        nhf0Var.j();
                                        break;
                                    case 9:
                                        nhf0Var.h();
                                        break;
                                    case 10:
                                        if (nhf0Var.g.b.length() > 0 && (ukf0Var = nhf0Var.c) != null) {
                                            int iF3 = nhf0Var.f(ukf0Var, -1);
                                            nhf0Var.o(iF3, iF3);
                                        }
                                        break;
                                    case 11:
                                        if (nhf0Var.g.b.length() > 0 && (ukf0Var2 = nhf0Var.c) != null) {
                                            int iF4 = nhf0Var.f(ukf0Var2, 1);
                                            nhf0Var.o(iF4, iF4);
                                        }
                                        break;
                                    case 12:
                                        if (nhf0Var.g.b.length() > 0 && (vkf0Var = nhf0Var.i) != null) {
                                            int iR = nhf0Var.r(vkf0Var, -1);
                                            nhf0Var.o(iR, iR);
                                        }
                                        break;
                                    case 13:
                                        if (nhf0Var.g.b.length() > 0 && (vkf0Var2 = nhf0Var.i) != null) {
                                            int iR2 = nhf0Var.r(vkf0Var2, 1);
                                            nhf0Var.o(iR2, iR2);
                                        }
                                        break;
                                    case 14:
                                        nhf0Var.m();
                                        break;
                                    case 15:
                                        nhf0Var.l();
                                        break;
                                    case 16:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            if (!nhf0Var.e()) {
                                                nhf0Var.l();
                                            } else {
                                                nhf0Var.m();
                                            }
                                        }
                                        break;
                                    case 17:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            if (!nhf0Var.e()) {
                                                nhf0Var.m();
                                            } else {
                                                nhf0Var.l();
                                            }
                                        }
                                        break;
                                    case 18:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            nhf0Var.o(0, 0);
                                        }
                                        break;
                                    case 19:
                                        nhf0Var.e.a = null;
                                        nk0 nk0Var3 = nhf0Var.g;
                                        if (nk0Var3.b.length() > 0) {
                                            int length = nk0Var3.b.length();
                                            nhf0Var.o(length, length);
                                        }
                                        break;
                                    case 20:
                                        List<mof> listQ = nhf0Var.q(new fib(1));
                                        if (listQ != null) {
                                            bhf0Var2.a(listQ);
                                            Unit unit3 = Unit.a;
                                        }
                                        break;
                                    case 21:
                                        List<mof> listQ2 = nhf0Var.q(new ygf0());
                                        if (listQ2 != null) {
                                            bhf0Var2.a(listQ2);
                                            Unit unit4 = Unit.a;
                                        }
                                        break;
                                    case 22:
                                        List<mof> listQ3 = nhf0Var.q(new nk7(1));
                                        if (listQ3 != null) {
                                            bhf0Var2.a(listQ3);
                                            Unit unit5 = Unit.a;
                                        }
                                        break;
                                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                        List<mof> listQ4 = nhf0Var.q(new zgf0());
                                        if (listQ4 != null) {
                                            bhf0Var2.a(listQ4);
                                            Unit unit6 = Unit.a;
                                        }
                                        break;
                                    case 24:
                                        List<mof> listQ5 = nhf0Var.q(new ahf0());
                                        if (listQ5 != null) {
                                            bhf0Var2.a(listQ5);
                                            Unit unit7 = Unit.a;
                                        }
                                        break;
                                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                                        List<mof> listQ6 = nhf0Var.q(new kib(1));
                                        if (listQ6 != null) {
                                            bhf0Var2.a(listQ6);
                                            Unit unit8 = Unit.a;
                                        }
                                        break;
                                    case RuntimeVersion.MINOR /* 26 */:
                                        if (bhf0Var2.e) {
                                            yp40Var2.a = ((n6s) bhf0Var2.a.x.b).r.b(bhf0Var2.l);
                                        } else {
                                            bhf0Var2.a(a.c(new ba8("\n", 1)));
                                        }
                                        Unit unit9 = Unit.a;
                                        break;
                                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                        if (bhf0Var2.e) {
                                            yp40Var2.a = false;
                                        } else {
                                            bhf0Var2.a(a.c(new ba8("\t", 1)));
                                        }
                                        Unit unit10 = Unit.a;
                                        break;
                                    case 28:
                                        nhf0Var.e.a = null;
                                        nk0 nk0Var4 = nhf0Var.g;
                                        if (nk0Var4.b.length() > 0) {
                                            nhf0Var.o(0, nk0Var4.b.length());
                                        }
                                        break;
                                    case 29:
                                        nhf0Var.g();
                                        nhf0Var.n();
                                        break;
                                    case 30:
                                        nhf0Var.k();
                                        nhf0Var.n();
                                        break;
                                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                        tlf0 tlf0Var4 = nhf0Var.e;
                                        tlf0Var4.a = null;
                                        nk0 nk0Var5 = nhf0Var.g;
                                        String str5 = nk0Var5.b;
                                        String str6 = nk0Var5.b;
                                        if (str5.length() > 0) {
                                            if (nhf0Var.e()) {
                                                tlf0Var4.a = null;
                                                if (str6.length() > 0 && (numD3 = nhf0Var.d()) != null) {
                                                    int iIntValue5 = numD3.intValue();
                                                    nhf0Var.o(iIntValue5, iIntValue5);
                                                }
                                            } else {
                                                tlf0Var4.a = null;
                                                if (str6.length() > 0 && (numC3 = nhf0Var.c()) != null) {
                                                    int iIntValue6 = numC3.intValue();
                                                    nhf0Var.o(iIntValue6, iIntValue6);
                                                }
                                            }
                                        }
                                        nhf0Var.n();
                                        break;
                                    case 32:
                                        tlf0 tlf0Var5 = nhf0Var.e;
                                        tlf0Var5.a = null;
                                        nk0 nk0Var6 = nhf0Var.g;
                                        String str7 = nk0Var6.b;
                                        String str8 = nk0Var6.b;
                                        if (str7.length() > 0) {
                                            if (nhf0Var.e()) {
                                                tlf0Var5.a = null;
                                                if (str8.length() > 0 && (numC4 = nhf0Var.c()) != null) {
                                                    int iIntValue7 = numC4.intValue();
                                                    nhf0Var.o(iIntValue7, iIntValue7);
                                                }
                                            } else {
                                                tlf0Var5.a = null;
                                                if (str8.length() > 0 && (numD4 = nhf0Var.d()) != null) {
                                                    int iIntValue8 = numD4.intValue();
                                                    nhf0Var.o(iIntValue8, iIntValue8);
                                                }
                                            }
                                        }
                                        nhf0Var.n();
                                        break;
                                    case 33:
                                        nhf0Var.j();
                                        nhf0Var.n();
                                        break;
                                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                        nhf0Var.h();
                                        nhf0Var.n();
                                        break;
                                    case 35:
                                        nhf0Var.m();
                                        nhf0Var.n();
                                        break;
                                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                        nhf0Var.l();
                                        nhf0Var.n();
                                        break;
                                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            if (nhf0Var.e()) {
                                                nhf0Var.m();
                                            } else {
                                                nhf0Var.l();
                                            }
                                        }
                                        nhf0Var.n();
                                        break;
                                    case 38:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            if (nhf0Var.e()) {
                                                nhf0Var.l();
                                            } else {
                                                nhf0Var.m();
                                            }
                                        }
                                        nhf0Var.n();
                                        break;
                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                        if (nhf0Var.g.b.length() > 0 && (ukf0Var3 = nhf0Var.c) != null) {
                                            int iF5 = nhf0Var.f(ukf0Var3, -1);
                                            nhf0Var.o(iF5, iF5);
                                        }
                                        nhf0Var.n();
                                        break;
                                    case 40:
                                        if (nhf0Var.g.b.length() > 0 && (ukf0Var4 = nhf0Var.c) != null) {
                                            int iF6 = nhf0Var.f(ukf0Var4, 1);
                                            nhf0Var.o(iF6, iF6);
                                        }
                                        nhf0Var.n();
                                        break;
                                    case 41:
                                        if (nhf0Var.g.b.length() > 0 && (vkf0Var3 = nhf0Var.i) != null) {
                                            int iR3 = nhf0Var.r(vkf0Var3, -1);
                                            nhf0Var.o(iR3, iR3);
                                        }
                                        nhf0Var.n();
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                        if (nhf0Var.g.b.length() > 0 && (vkf0Var4 = nhf0Var.i) != null) {
                                            int iR4 = nhf0Var.r(vkf0Var4, 1);
                                            nhf0Var.o(iR4, iR4);
                                        }
                                        nhf0Var.n();
                                        break;
                                    case 43:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            nhf0Var.o(0, 0);
                                        }
                                        nhf0Var.n();
                                        break;
                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                        nhf0Var.e.a = null;
                                        nk0 nk0Var7 = nhf0Var.g;
                                        if (nk0Var7.b.length() > 0) {
                                            int length2 = nk0Var7.b.length();
                                            nhf0Var.o(length2, length2);
                                        }
                                        nhf0Var.n();
                                        break;
                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                        nhf0Var.e.a = null;
                                        if (nhf0Var.g.b.length() > 0) {
                                            long j3 = nhf0Var.f;
                                            int i6 = ulf0.c;
                                            int i7 = (int) (j3 & 4294967295L);
                                            nhf0Var.o(i7, i7);
                                        }
                                        break;
                                    case 46:
                                        odh0 odh0Var = bhf0Var2.h;
                                        if (odh0Var != null) {
                                            odh0Var.a(ijf0.a(nhf0Var.h, nhf0Var.g, nhf0Var.f, 4));
                                        }
                                        odh0 odh0Var2 = bhf0Var2.h;
                                        if (odh0Var2 != null) {
                                            odh0.a aVar2 = odh0Var2.b;
                                            if (aVar2 != null && (aVar = aVar2.a) != null) {
                                                odh0Var2.b = aVar;
                                                odh0Var2.d -= aVar2.b.a.b.length();
                                                odh0Var2.c = new odh0.a(odh0Var2.c, aVar2.b);
                                                ijf0Var = aVar.b;
                                            }
                                            if (ijf0Var != null) {
                                                bhf0Var2.k.invoke(ijf0Var);
                                                Unit unit11 = Unit.a;
                                            }
                                        }
                                        break;
                                    case 47:
                                        odh0 odh0Var3 = bhf0Var2.h;
                                        if (odh0Var3 != null) {
                                            odh0.a aVar3 = odh0Var3.c;
                                            if (aVar3 != null) {
                                                odh0Var3.c = aVar3.a;
                                                ijf0 ijf0Var2 = aVar3.b;
                                                odh0Var3.b = new odh0.a(odh0Var3.b, ijf0Var2);
                                                odh0Var3.d = ijf0Var2.a.b.length() + odh0Var3.d;
                                                ijf0Var = aVar3.b;
                                            }
                                            if (ijf0Var != null) {
                                                bhf0Var2.k.invoke(ijf0Var);
                                                Unit unit12 = Unit.a;
                                            }
                                        }
                                        break;
                                    case 48:
                                    case 49:
                                        Unit unit13 = Unit.a;
                                        break;
                                    default:
                                        uhc.a();
                                        return null;
                                }
                                return Unit.a;
                            }
                        };
                        ijf0 ijf0Var = bhf0Var.c;
                        nhf0 nhf0Var = new nhf0(ijf0Var, bhf0Var.g, bhf0Var.a.d(), tlf0Var);
                        function2.invoke(nhf0Var);
                        boolean zB = ulf0.b(nhf0Var.f, ijf0Var.b);
                        nk0 nk0Var = nhf0Var.g;
                        if (!zB || !Intrinsics.g(nk0Var, ijf0Var.a)) {
                            bhf0Var.k.invoke(ijf0.a(ijf0Var, nk0Var, nhf0Var.f, 4));
                        }
                        odh0 odh0Var = bhf0Var.h;
                        if (odh0Var != null) {
                            odh0Var.f = true;
                        }
                        z2 = yp40Var.a;
                    }
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kuk(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.a = 2;
    }
}
