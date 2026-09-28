package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import com.sportygames.lobby.remote.models.NotificationResponse;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gbt {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x037a  */
    /* JADX WARN: Code duplicated, block: B:66:0x023e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0242  */
    /* JADX WARN: Code duplicated, block: B:72:0x025d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0278  */
    /* JADX WARN: Code duplicated, block: B:77:0x027d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0306  */
    /* JADX WARN: Code duplicated, block: B:87:0x0318  */
    /* JADX WARN: Code duplicated, block: B:88:0x031a  */
    /* JADX WARN: Code duplicated, block: B:95:0x032c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0361  */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v13 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v13 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v15 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v15 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 androidx.compose.runtime.b, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void a(final LobbyV2HomeItemModel lobbyV2HomeItemModel, final h0s h0sVar, final gaj gajVar, final boolean z, l1z l1zVar, androidx.compose.runtime.a aVar, final int i) {
        final l1z l1zVar2;
        b bVar;
        int i2;
        l1z l1zVar3;
        Object obj;
        final ytw ytwVar;
        v1b v1bVar;
        l1z l1zVar4;
        l1z l1zVar5;
        boolean z2;
        b bVar2;
        zzr zzrVar;
        int i3;
        int iHashCode;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj2;
        b bVar3;
        h0sVar.getClass();
        b bVarI = aVar.i(1663437462);
        int i5 = i | (bVarI.A(lobbyV2HomeItemModel) ? 4 : 2) | (bVarI.A(h0sVar) ? 32 : 16) | (bVarI.A(gajVar) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | 8192;
        if (bVarI.q(i5 & 1, (i5 & 9363) != 9362)) {
            bVarI.A0();
            int i6 = i & 1;
            Object obj3 = androidx.compose.runtime.a.C0041a.a;
            if (i6 == 0 || bVarI.h0()) {
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                Object objY = bVarI.y();
                if (zM || objY == obj3) {
                    objY = qn70VarA.a(jq40.a(l1z.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                i2 = i5 & (-57345);
                l1zVar3 = (l1z) objY;
            } else {
                bVarI.G();
                i2 = i5 & (-57345);
                l1zVar3 = l1zVar;
            }
            bVarI.Y();
            final zzr zzrVarA = e0s.a(0, 3, bVarI);
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            Object objY2 = bVarI.y();
            if (objY2 == obj3) {
                objY2 = xvf.i(e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            final int iC = h0sVar.c();
            Object objY3 = bVarI.y();
            if (objY3 == obj3) {
                objY3 = m.b(Boolean.TRUE);
                bVarI.r(objY3);
            }
            ytw ytwVar2 = (ytw) objY3;
            boolean zA = bVarI.A(v5bVar) | bVarI.M(zzrVarA) | bVarI.A(l1zVar3) | bVarI.A(lobbyV2HomeItemModel) | bVarI.A(ibsVar);
            Object objY4 = bVarI.y();
            if (zA || objY4 == obj3) {
                ytwVar = ytwVar2;
                v1bVar = null;
                final l1z l1zVar6 = l1zVar3;
                obj = new Function1() { // from class: yat
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [bbt, hbs] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        ((use) obj4).getClass();
                        final v5b v5bVar2 = v5bVar;
                        final l1z l1zVar7 = l1zVar6;
                        final LobbyV2HomeItemModel lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                        final ytw ytwVar3 = ytwVar;
                        final zzr zzrVar2 = zzrVarA;
                        ?? r0 = new cbs() { // from class: bbt
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                l1z l1zVar8 = l1zVar7;
                                LobbyV2HomeItemModel lobbyV2HomeItemModel3 = lobbyV2HomeItemModel2;
                                int i7 = gbt.a.a[aVar2.ordinal()];
                                ytw ytwVar4 = ytwVar3;
                                if (i7 == 1) {
                                    ytwVar4.setValue(Boolean.FALSE);
                                    ej5.c(v5bVar2, null, null, new dbt(zzrVar2, null), 3);
                                } else {
                                    if (i7 != 2) {
                                        return;
                                    }
                                    ytwVar4.setValue(Boolean.TRUE);
                                    try {
                                        int order = lobbyV2HomeItemModel3.getOrder();
                                        l1zVar8.getClass();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("entrance", "lobby_home");
                                        linkedHashMap.put("section_position", Integer.valueOf(order));
                                        hym.a(l1zVar8.a, "game_lobby__top_wins__section_view", linkedHashMap, 12);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        };
                        ibs ibsVar2 = ibsVar;
                        ibsVar2.getLifecycle().a(r0);
                        return new fbt(ibsVar2, r0);
                    }
                };
                ibsVar = ibsVar;
                l1zVar4 = l1zVar6;
                bVarI.r(obj);
            } else {
                ytwVar = ytwVar2;
                obj = objY4;
                v1bVar = null;
                l1zVar4 = l1zVar3;
            }
            xvf.a(ibsVar, zzrVarA, (Function1) obj, bVarI);
            if (iC > 0) {
                bVarI.N(134665249);
                Integer numValueOf = Integer.valueOf(iC);
                Boolean bool = (Boolean) ytwVar.getValue();
                bool.getClass();
                boolean zD = bVarI.d(iC) | bVarI.M(zzrVarA);
                Object objY5 = bVarI.y();
                if (zD || objY5 == obj3) {
                    objY5 = new ebt(iC, zzrVarA, ytwVar, v1bVar);
                    bVarI.r(objY5);
                }
                xvf.f(zzrVarA, numValueOf, bool, (Function2) objY5, bVarI);
                String key = lobbyV2HomeItemModel.getKey();
                key.getClass();
                String strConcat = "lobby_v2_top_wins_".concat(key);
                d.a aVar2 = d.a.b;
                d dVarA = androidx.compose.ui.platform.d.a(aVar2, strConcat);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarA);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar4 = yka.a.f;
                hlh0.a(bVarI, i78VarA, bVar4);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S) {
                    zzrVar = zzrVarA;
                } else {
                    zzrVar = zzrVarA;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar);
                    i3 = i2;
                    g4t.a(lobbyV2HomeItemModel, false, null, bVarI, i2 & 14, 6);
                    d dVarA2 = d35.a(h.j(ls7.a(androidx.compose.foundation.layout.c.a(j.g(aVar2, 1.0f), 3.7333333f), j060.c(12.0f)), fw20.a(R.dimen._8sdp, bVarI), 0.0f, fw20.a(R.dimen._8sdp, bVarI), fw20.a(R.dimen._8sdp, bVarI), 2), 0.5f, ((th60) bVarI.O(vh60.a)).r0, j060.c(12.0f));
                    aiv aivVarC = g75.c(ht.a.e, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC2 = c.c(bVarI, dVarA2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, bVar4);
                    hlh0.a(bVarI, ne00VarS2, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC2, cVar);
                    float fA = fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI);
                    i060 i060Var = lat.a;
                    bVarI.N(2121220398);
                    if (doc.a(bVarI)) {
                        i4 = R.drawable.lobby_v2_top_wins_dark_1_bg;
                    } else {
                        i4 = R.drawable.lobby_v2_top_wins_yellow_bg;
                    }
                    bVarI.X(false);
                    d dVarA3 = ls7.a(j.e(aVar2, 1.0f), j060.c(12.0f));
                    nan.a aVar4 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                    aVar4.c = Integer.valueOf(i4);
                    abn.e(aVar4, i4);
                    abn.b(aVar4, i4);
                    abn.a(aVar4, false);
                    mw90.a(aVar4.a(), "Background Image", dVarA3, null, null, d0b.a.g, null, bVarI, 1572912, 1976);
                    d dVarH = h.h(j.e(aVar2, 1.0f), 0.5f, 0.0f, 2);
                    kw0.i iVar = new kw0.i(fA, true, new hw0());
                    boolean zD2 = bVarI.d(iC);
                    if ((i3 & 112) != 32 || bVarI.A(h0sVar)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean zA2 = zD2 | z3 | bVarI.A(lobbyV2HomeItemModel) | bVarI.A(l1zVar4);
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zA2 | z4;
                    Object objY6 = bVarI.y();
                    if (!z5 || objY6 == obj3) {
                        final l1z l1zVar7 = l1zVar4;
                        obj2 = new Function1() { // from class: zat
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                szr szrVar = (szr) obj4;
                                szrVar.getClass();
                                final int i7 = iC;
                                final h0s h0sVar2 = h0sVar;
                                final LobbyV2HomeItemModel lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                                final l1z l1zVar8 = l1zVar7;
                                final gaj gajVar2 = gajVar;
                                szr.f(szrVar, i7, null, new op8(1903319563, new iaj() { // from class: cbt
                                    @Override // defpackage.iaj
                                    public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                        int iIntValue = ((Integer) obj6).intValue();
                                        a aVar5 = (a) obj7;
                                        int iIntValue2 = ((Integer) obj8).intValue();
                                        ((gwr) obj5).getClass();
                                        if ((iIntValue2 & 48) == 0) {
                                            iIntValue2 |= aVar5.d(iIntValue) ? 32 : 16;
                                        }
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                            int i8 = i7;
                                            if (iIntValue < i8) {
                                                aVar5.N(-365049751);
                                                NotificationResponse notificationResponse = (NotificationResponse) h0sVar2.b(iIntValue);
                                                if (notificationResponse == null) {
                                                    aVar5.H();
                                                    return Unit.a;
                                                }
                                                d dVarE = d.a.b;
                                                if (iIntValue == 0) {
                                                    aVar5.N(-364884490);
                                                    dVarE = h.e(dVarE, h.b(fw20.a(R.dimen.lobby_v2_general_item_spacing, aVar5), 0.0f, 0.0f, 0.0f, 14));
                                                } else {
                                                    aVar5.N(-373639913);
                                                }
                                                aVar5.H();
                                                if (iIntValue == i8 - 1) {
                                                    aVar5.N(-364641512);
                                                    dVarE = h.e(dVarE, h.b(0.0f, 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, aVar5), 0.0f, 11));
                                                } else {
                                                    aVar5.N(-373639913);
                                                }
                                                aVar5.H();
                                                xat.a(androidx.compose.foundation.layout.c.a(j.w(dVarE, ((Configuration) aVar5.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.6f), 3.2608695f), notificationResponse, iIntValue, lobbyV2HomeItemModel2.getOrder(), l1zVar8, gajVar2, aVar5, (iIntValue2 << 3) & 896);
                                            } else {
                                                aVar5.N(-373639913);
                                            }
                                            aVar5.H();
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true), 6);
                                return Unit.a;
                            }
                        };
                        l1zVar5 = l1zVar7;
                        bVarI.r(obj2);
                    } else {
                        obj2 = objY6;
                        l1zVar5 = l1zVar4;
                    }
                    aur.b(dVarH, zzrVar, null, iVar, ht.a.k, null, false, null, (Function1) obj2, bVarI, 12779526, 332);
                    bVar3 = bVarI;
                    bVar3.X(r10);
                    bVar3.X(true);
                    if (z) {
                        bVar3.N(139536372);
                        ty0.a(bVar3, j.i(aVar2, fw20.a(R.dimen.lobby_v2_general_item_spacing, bVar3)));
                        z2 = false;
                    } else {
                        z2 = false;
                        bVar3.N(129672172);
                    }
                    bVar3.X(z2);
                    bVar2 = bVar3;
                }
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar2);
                i3 = i2;
                g4t.a(lobbyV2HomeItemModel, false, null, bVarI, i2 & 14, 6);
                d dVarA4 = d35.a(h.j(ls7.a(androidx.compose.foundation.layout.c.a(j.g(aVar2, 1.0f), 3.7333333f), j060.c(12.0f)), fw20.a(R.dimen._8sdp, bVarI), 0.0f, fw20.a(R.dimen._8sdp, bVarI), fw20.a(R.dimen._8sdp, bVarI), 2), 0.5f, ((th60) bVarI.O(vh60.a)).r0, j060.c(12.0f));
                aiv aivVarC2 = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarA4);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar4);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar2);
                float fA2 = fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI);
                i060 i060Var2 = lat.a;
                bVarI.N(2121220398);
                if (doc.a(bVarI)) {
                    i4 = R.drawable.lobby_v2_top_wins_dark_1_bg;
                } else {
                    i4 = R.drawable.lobby_v2_top_wins_yellow_bg;
                }
                bVarI.X(false);
                d dVarA5 = ls7.a(j.e(aVar2, 1.0f), j060.c(12.0f));
                nan.a aVar5 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                aVar5.c = Integer.valueOf(i4);
                abn.e(aVar5, i4);
                abn.b(aVar5, i4);
                abn.a(aVar5, false);
                mw90.a(aVar5.a(), "Background Image", dVarA5, null, null, d0b.a.g, null, bVarI, 1572912, 1976);
                d dVarH2 = h.h(j.e(aVar2, 1.0f), 0.5f, 0.0f, 2);
                kw0.i iVar2 = new kw0.i(fA2, true, new hw0());
                boolean zD3 = bVarI.d(iC);
                if ((i3 & 112) != 32) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                boolean zA3 = zD3 | z3 | bVarI.A(lobbyV2HomeItemModel) | bVarI.A(l1zVar4);
                if ((i3 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zA3 | z4;
                Object objY7 = bVarI.y();
                if (z5) {
                    final l1z l1zVar8 = l1zVar4;
                    obj2 = new Function1() { // from class: zat
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            szr szrVar = (szr) obj4;
                            szrVar.getClass();
                            final int i7 = iC;
                            final h0s h0sVar2 = h0sVar;
                            final LobbyV2HomeItemModel lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                            final l1z l1zVar9 = l1zVar8;
                            final gaj gajVar2 = gajVar;
                            szr.f(szrVar, i7, null, new op8(1903319563, new iaj() { // from class: cbt
                                @Override // defpackage.iaj
                                public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                    int iIntValue = ((Integer) obj6).intValue();
                                    a aVar6 = (a) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    ((gwr) obj5).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= aVar6.d(iIntValue) ? 32 : 16;
                                    }
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        int i8 = i7;
                                        if (iIntValue < i8) {
                                            aVar6.N(-365049751);
                                            NotificationResponse notificationResponse = (NotificationResponse) h0sVar2.b(iIntValue);
                                            if (notificationResponse == null) {
                                                aVar6.H();
                                                return Unit.a;
                                            }
                                            d dVarE = d.a.b;
                                            if (iIntValue == 0) {
                                                aVar6.N(-364884490);
                                                dVarE = h.e(dVarE, h.b(fw20.a(R.dimen.lobby_v2_general_item_spacing, aVar6), 0.0f, 0.0f, 0.0f, 14));
                                            } else {
                                                aVar6.N(-373639913);
                                            }
                                            aVar6.H();
                                            if (iIntValue == i8 - 1) {
                                                aVar6.N(-364641512);
                                                dVarE = h.e(dVarE, h.b(0.0f, 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, aVar6), 0.0f, 11));
                                            } else {
                                                aVar6.N(-373639913);
                                            }
                                            aVar6.H();
                                            xat.a(androidx.compose.foundation.layout.c.a(j.w(dVarE, ((Configuration) aVar6.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.6f), 3.2608695f), notificationResponse, iIntValue, lobbyV2HomeItemModel2.getOrder(), l1zVar9, gajVar2, aVar6, (iIntValue2 << 3) & 896);
                                        } else {
                                            aVar6.N(-373639913);
                                        }
                                        aVar6.H();
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 6);
                            return Unit.a;
                        }
                    };
                    l1zVar5 = l1zVar8;
                    bVarI.r(obj2);
                } else {
                    final l1z l1zVar9 = l1zVar4;
                    obj2 = new Function1() { // from class: zat
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            szr szrVar = (szr) obj4;
                            szrVar.getClass();
                            final int i7 = iC;
                            final h0s h0sVar2 = h0sVar;
                            final LobbyV2HomeItemModel lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                            final l1z l1zVar10 = l1zVar9;
                            final gaj gajVar2 = gajVar;
                            szr.f(szrVar, i7, null, new op8(1903319563, new iaj() { // from class: cbt
                                @Override // defpackage.iaj
                                public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                    int iIntValue = ((Integer) obj6).intValue();
                                    a aVar6 = (a) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    ((gwr) obj5).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= aVar6.d(iIntValue) ? 32 : 16;
                                    }
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        int i8 = i7;
                                        if (iIntValue < i8) {
                                            aVar6.N(-365049751);
                                            NotificationResponse notificationResponse = (NotificationResponse) h0sVar2.b(iIntValue);
                                            if (notificationResponse == null) {
                                                aVar6.H();
                                                return Unit.a;
                                            }
                                            d dVarE = d.a.b;
                                            if (iIntValue == 0) {
                                                aVar6.N(-364884490);
                                                dVarE = h.e(dVarE, h.b(fw20.a(R.dimen.lobby_v2_general_item_spacing, aVar6), 0.0f, 0.0f, 0.0f, 14));
                                            } else {
                                                aVar6.N(-373639913);
                                            }
                                            aVar6.H();
                                            if (iIntValue == i8 - 1) {
                                                aVar6.N(-364641512);
                                                dVarE = h.e(dVarE, h.b(0.0f, 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, aVar6), 0.0f, 11));
                                            } else {
                                                aVar6.N(-373639913);
                                            }
                                            aVar6.H();
                                            xat.a(androidx.compose.foundation.layout.c.a(j.w(dVarE, ((Configuration) aVar6.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.6f), 3.2608695f), notificationResponse, iIntValue, lobbyV2HomeItemModel2.getOrder(), l1zVar10, gajVar2, aVar6, (iIntValue2 << 3) & 896);
                                        } else {
                                            aVar6.N(-373639913);
                                        }
                                        aVar6.H();
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 6);
                            return Unit.a;
                        }
                    };
                    l1zVar5 = l1zVar9;
                    bVarI.r(obj2);
                }
                aur.b(dVarH2, zzrVar, null, iVar2, ht.a.k, null, false, null, (Function1) obj2, bVarI, 12779526, 332);
                bVar3 = bVarI;
                bVar3.X(r10);
                bVar3.X(true);
                if (z) {
                    bVar3.N(139536372);
                    ty0.a(bVar3, j.i(aVar2, fw20.a(R.dimen.lobby_v2_general_item_spacing, bVar3)));
                    z2 = false;
                } else {
                    z2 = false;
                    bVar3.N(129672172);
                }
                bVar3.X(z2);
                bVar2 = bVar3;
            } else {
                l1zVar5 = l1zVar4;
                z2 = false;
                bVarI.N(129672172);
                bVar2 = bVarI;
            }
            bVar2.X(z2);
            l1zVar2 = l1zVar5;
            bVar = bVar2;
        } else {
            bVarI.G();
            l1zVar2 = l1zVar;
            bVar = bVarI;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(h0sVar, gajVar, z, l1zVar2, i) { // from class: abt
                public final /* synthetic */ h0s b;
                public final /* synthetic */ gaj c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ l1z e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iA = qj40.a(65);
                    gbt.a(this.a, this.b, this.c, this.d, this.e, (a) obj4, iA);
                    return Unit.a;
                }
            };
        }
    }
}
