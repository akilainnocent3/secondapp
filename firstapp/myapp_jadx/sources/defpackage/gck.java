package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sportybet.android.globalpay.quickinput.model.QuickInputConfigMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.quickinput.uc.GetQuickInputUC$invoke$1", f = "GetQuickInputUC.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 29}, m = "invokeSuspend", v = 2)
public final class gck extends tje0 implements Function2<myh<? super sj30>, v1b<? super Unit>, Object> {
    public gg30 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hck d;
    public final /* synthetic */ String e;

    public static final class a implements Function1<BOConfigValueBundle, QuickInputConfigMap> {
        public final /* synthetic */ BOConfigParamDto a;

        public a(BOConfigParamDto bOConfigParamDto) {
            this.a = bOConfigParamDto;
        }

        @Override // kotlin.jvm.functions.Function1
        public final QuickInputConfigMap invoke(BOConfigValueBundle bOConfigValueBundle) {
            BOConfigValueBundle bOConfigValueBundle2 = bOConfigValueBundle;
            bOConfigValueBundle2.getClass();
            BOConfigValueWrapper response = bOConfigValueBundle2.getResponse(this.a);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(QuickInputConfigMap.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    return (QuickInputConfigMap) (configValue instanceof QuickInputConfigMap ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                StringsKt.toIntOrNull((String) configValue);
                return null;
            }
            if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    return (QuickInputConfigMap) (configValue instanceof QuickInputConfigMap ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                StringsKt.s0((String) configValue);
                return null;
            }
            if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    return (QuickInputConfigMap) (configValue instanceof QuickInputConfigMap ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                b.i((String) configValue);
                return null;
            }
            if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    return (QuickInputConfigMap) (configValue instanceof QuickInputConfigMap ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                b.h((String) configValue);
                return null;
            }
            if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    return (QuickInputConfigMap) (configValue instanceof QuickInputConfigMap ? configValue : null);
                }
                if (!(configValue instanceof String)) {
                    return null;
                }
                StringsKt.r0((String) configValue);
                return null;
            }
            if (!dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    return (QuickInputConfigMap) (configValue instanceof QuickInputConfigMap ? configValue : null);
                }
                return null;
            }
            if (configValue == null) {
                return null;
            }
            configValue.toString();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gck(hck hckVar, String str, v1b<? super gck> v1bVar) {
        super(2, v1bVar);
        this.d = hckVar;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gck gckVar = new gck(this.d, this.e, v1bVar);
        gckVar.c = obj;
        return gckVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super sj30> myhVar, v1b<? super Unit> v1bVar) {
        return ((gck) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (r2.emit(r6, r10) == r3) goto L41;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gck.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
