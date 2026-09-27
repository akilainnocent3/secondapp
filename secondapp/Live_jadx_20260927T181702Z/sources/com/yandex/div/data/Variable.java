package com.yandex.div.data;

import android.net.Uri;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import cv.p0;
import dr.o0;
import dr.w2;
import java.util.Iterator;
import k.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import mq.b0;
import mq.d;
import mq.ds;
import mq.fr;
import mq.j;
import mq.js;
import mq.mr;
import mq.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Variable {

    @l
    private final ObserverList<ds.l<Variable, w2>> observers;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class ArrayVariable extends Variable {

        @l
        private final JSONArray defaultValue;

        @l
        private final String name;

        @l
        private JSONArray value;

        public ArrayVariable(@l String str, @l JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.defaultValue = jSONArray;
            this.value = getDefaultValue();
        }

        @Override // com.yandex.div.data.Variable
        @l
        public JSONArray getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }

        @l
        public JSONArray getValue$div_data_release() {
            return this.value;
        }

        @j0
        public void set(@l JSONArray jSONArray) {
            setValue$div_data_release(jSONArray);
        }

        public void setValue$div_data_release(@l JSONArray jSONArray) {
            if (m0.g(this.value, jSONArray)) {
                return;
            }
            this.value = jSONArray;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class BooleanVariable extends Variable {
        private final boolean defaultValue;

        @l
        private final String name;
        private boolean value;

        public BooleanVariable(@l String str, boolean z10) {
            super(null);
            this.name = str;
            this.defaultValue = z10;
            this.value = getDefaultValue();
        }

        public boolean getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }

        public boolean getValue$div_data_release() {
            return this.value;
        }

        @j0
        public void set(boolean z10) {
            setValue$div_data_release(z10);
        }

        public void setValue$div_data_release(boolean z10) {
            if (this.value == z10) {
                return;
            }
            this.value = z10;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class ColorVariable extends Variable {
        private final int defaultValue;

        @l
        private final String name;
        private int value;

        public ColorVariable(@l String str, int i10) {
            super(null);
            this.name = str;
            this.defaultValue = i10;
            this.value = Color.m3342constructorimpl(getDefaultValue());
        }

        public int getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue-WpymAT4$div_data_release, reason: not valid java name */
        public int m3282getValueWpymAT4$div_data_release() {
            return this.value;
        }

        @j0
        /* JADX INFO: renamed from: set-cIhhviA, reason: not valid java name */
        public void m3283setcIhhviA(int i10) throws VariableMutationException {
            Integer numInvoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(Color.m3341boximpl(i10));
            if (numInvoke != null) {
                m3284setValuecIhhviA$div_data_release(Color.m3342constructorimpl(numInvoke.intValue()));
                return;
            }
            throw new VariableMutationException("Wrong value format for color variable: '" + ((Object) Color.m3348toStringimpl(i10)) + '\'', null, 2, null);
        }

        /* JADX INFO: renamed from: setValue-cIhhviA$div_data_release, reason: not valid java name */
        public void m3284setValuecIhhviA$div_data_release(int i10) {
            if (Color.m3344equalsimpl0(this.value, i10)) {
                return;
            }
            this.value = i10;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class DictVariable extends Variable {

        @l
        private final JSONObject defaultValue;

        @l
        private final String name;

        @l
        private JSONObject value;

        public DictVariable(@l String str, @l JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.defaultValue = jSONObject;
            this.value = getDefaultValue();
        }

        @Override // com.yandex.div.data.Variable
        @l
        public JSONObject getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }

        @l
        public JSONObject getValue$div_data_release() {
            return this.value;
        }

        @j0
        public void set(@l JSONObject jSONObject) {
            setValue$div_data_release(jSONObject);
        }

        public void setValue$div_data_release(@l JSONObject jSONObject) {
            if (m0.g(this.value, jSONObject)) {
                return;
            }
            this.value = jSONObject;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class DoubleVariable extends Variable {
        private final double defaultValue;

        @l
        private final String name;
        private double value;

        public DoubleVariable(@l String str, double d10) {
            super(null);
            this.name = str;
            this.defaultValue = d10;
            this.value = getDefaultValue();
        }

        public double getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }

        public double getValue$div_data_release() {
            return this.value;
        }

        @j0
        public void set(double d10) {
            setValue$div_data_release(d10);
        }

        public void setValue$div_data_release(double d10) {
            if (this.value == d10) {
                return;
            }
            this.value = d10;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class IntegerVariable extends Variable {
        private final long defaultValue;

        @l
        private final String name;
        private long value;

        public IntegerVariable(@l String str, long j10) {
            super(null);
            this.name = str;
            this.defaultValue = j10;
            this.value = getDefaultValue();
        }

        public long getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }

        public long getValue$div_data_release() {
            return this.value;
        }

        @j0
        public void set(long j10) {
            setValue$div_data_release(j10);
        }

        public void setValue$div_data_release(long j10) {
            if (this.value == j10) {
                return;
            }
            this.value = j10;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class PropertyVariable extends Variable {

        @l
        private final String name;

        public PropertyVariable(@l String str) {
            super(null);
            this.name = str;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class StringVariable extends Variable {

        @l
        private final String defaultValue;

        @l
        private final String name;

        @l
        private String value;

        public StringVariable(@l String str, @l String str2) {
            super(null);
            this.name = str;
            this.defaultValue = str2;
            this.value = getDefaultValue();
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }

        @l
        public String getValue$div_data_release() {
            return this.value;
        }

        public void setValue$div_data_release(@l String str) {
            if (m0.g(this.value, str)) {
                return;
            }
            this.value = str;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class UrlVariable extends Variable {

        @l
        private final Uri defaultValue;

        @l
        private final String name;

        @l
        private Uri value;

        public UrlVariable(@l String str, @l Uri uri) {
            super(null);
            this.name = str;
            this.defaultValue = uri;
            this.value = getDefaultValue();
        }

        @Override // com.yandex.div.data.Variable
        @l
        public Uri getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @l
        public String getName() {
            return this.name;
        }

        @l
        public Uri getValue$div_data_release() {
            return this.value;
        }

        @j0
        public void set(@l Uri uri) {
            setValue$div_data_release(uri);
        }

        public void setValue$div_data_release(@l Uri uri) {
            if (m0.g(this.value, uri)) {
                return;
            }
            this.value = uri;
            notifyVariableChanged(this);
        }
    }

    public /* synthetic */ Variable(x xVar) {
        this();
    }

    private boolean parseAsBoolean(String str) {
        Boolean boolA6 = p0.a6(str);
        if (boolA6 != null) {
            return boolA6.booleanValue();
        }
        Boolean bool = ConvertUtilsKt.toBoolean(parseAsInt(str));
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new VariableMutationException("Unable to convert " + str + " to boolean", null, 2, null);
    }

    /* JADX INFO: renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private int m3281parseAsColorC4zCDoM(String str) {
        Integer numInvoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (numInvoke != null) {
            return Color.m3342constructorimpl(numInvoke.intValue());
        }
        throw new VariableMutationException("Wrong value format for color variable: '" + str + '\'', null, 2, null);
    }

    private double parseAsDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private int parseAsInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private JSONArray parseAsJsonArray(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private JSONObject parseAsJsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private long parseAsLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private Uri parseAsUri(String str) {
        try {
            return Uri.parse(str);
        } catch (IllegalArgumentException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    public void addObserver(@l ds.l<? super Variable, w2> lVar) {
        this.observers.addObserver(lVar);
    }

    @l
    public Object getDefaultValue() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).getDefaultValue();
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).getDefaultValue());
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).getDefaultValue());
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).getDefaultValue());
        }
        if (this instanceof ColorVariable) {
            return Integer.valueOf(((ColorVariable) this).getDefaultValue());
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).getDefaultValue();
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).getDefaultValue();
        }
        if (this instanceof ArrayVariable) {
            return ((ArrayVariable) this).getDefaultValue();
        }
        if (!(this instanceof PropertyVariable)) {
            throw new o0();
        }
        throw new dr.p0("An operation is not implemented: Support property variables");
    }

    @l
    public abstract String getName();

    @l
    public Object getValue() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).getValue$div_data_release();
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).getValue$div_data_release());
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).getValue$div_data_release());
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).getValue$div_data_release());
        }
        if (this instanceof ColorVariable) {
            return Color.m3341boximpl(((ColorVariable) this).m3282getValueWpymAT4$div_data_release());
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).getValue$div_data_release();
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).getValue$div_data_release();
        }
        if (this instanceof ArrayVariable) {
            return ((ArrayVariable) this).getValue$div_data_release();
        }
        if (!(this instanceof PropertyVariable)) {
            throw new o0();
        }
        throw new dr.p0("An operation is not implemented: Support property variables");
    }

    public void notifyVariableChanged(@l Variable variable) {
        Assert.assertMainThread();
        Iterator<ds.l<Variable, w2>> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().invoke(variable);
        }
    }

    public void removeObserver(@l ds.l<? super Variable, w2> lVar) {
        this.observers.removeObserver(lVar);
    }

    @j0
    public void set(@l String str) throws VariableMutationException {
        if (this instanceof StringVariable) {
            ((StringVariable) this).setValue$div_data_release(str);
            return;
        }
        if (this instanceof IntegerVariable) {
            ((IntegerVariable) this).setValue$div_data_release(parseAsLong(str));
            return;
        }
        if (this instanceof BooleanVariable) {
            ((BooleanVariable) this).setValue$div_data_release(parseAsBoolean(str));
            return;
        }
        if (this instanceof DoubleVariable) {
            ((DoubleVariable) this).setValue$div_data_release(parseAsDouble(str));
            return;
        }
        if (this instanceof ColorVariable) {
            ((ColorVariable) this).m3284setValuecIhhviA$div_data_release(m3281parseAsColorC4zCDoM(str));
            return;
        }
        if (this instanceof UrlVariable) {
            ((UrlVariable) this).setValue$div_data_release(parseAsUri(str));
            return;
        }
        if (this instanceof DictVariable) {
            ((DictVariable) this).setValue$div_data_release(parseAsJsonObject(str));
            return;
        }
        if (this instanceof ArrayVariable) {
            ((ArrayVariable) this).setValue$div_data_release(parseAsJsonArray(str));
        } else {
            if (!(this instanceof PropertyVariable)) {
                throw new o0();
            }
            throw new dr.p0("An operation is not implemented: Support property variables");
        }
    }

    @j0
    public void setValue(@l Variable variable) throws VariableMutationException {
        if ((this instanceof StringVariable) && (variable instanceof StringVariable)) {
            ((StringVariable) this).setValue$div_data_release(((StringVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof IntegerVariable) && (variable instanceof IntegerVariable)) {
            ((IntegerVariable) this).setValue$div_data_release(((IntegerVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof BooleanVariable) && (variable instanceof BooleanVariable)) {
            ((BooleanVariable) this).setValue$div_data_release(((BooleanVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof DoubleVariable) && (variable instanceof DoubleVariable)) {
            ((DoubleVariable) this).setValue$div_data_release(((DoubleVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof ColorVariable) && (variable instanceof ColorVariable)) {
            ((ColorVariable) this).m3284setValuecIhhviA$div_data_release(((ColorVariable) variable).m3282getValueWpymAT4$div_data_release());
            return;
        }
        if ((this instanceof UrlVariable) && (variable instanceof UrlVariable)) {
            ((UrlVariable) this).setValue$div_data_release(((UrlVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof DictVariable) && (variable instanceof DictVariable)) {
            ((DictVariable) this).setValue$div_data_release(((DictVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof ArrayVariable) && (variable instanceof ArrayVariable)) {
            ((ArrayVariable) this).setValue$div_data_release(((ArrayVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof PropertyVariable) && (variable instanceof PropertyVariable)) {
            throw new dr.p0("An operation is not implemented: Support property variables");
        }
        throw new VariableMutationException("Setting value to " + this + " from " + variable + " not supported!", null, 2, null);
    }

    @InternalApi
    @j0
    public void setValueDirectly(@l Object obj) throws VariableMutationException {
        try {
            if (this instanceof StringVariable) {
                m0.n(obj, "null cannot be cast to non-null type kotlin.String");
                ((StringVariable) this).setValue$div_data_release((String) obj);
                return;
            }
            if (this instanceof IntegerVariable) {
                m0.n(obj, "null cannot be cast to non-null type kotlin.Number");
                ((IntegerVariable) this).setValue$div_data_release(((Number) obj).longValue());
                return;
            }
            if (this instanceof BooleanVariable) {
                m0.n(obj, "null cannot be cast to non-null type kotlin.Boolean");
                ((BooleanVariable) this).setValue$div_data_release(((Boolean) obj).booleanValue());
                return;
            }
            if (this instanceof DoubleVariable) {
                m0.n(obj, "null cannot be cast to non-null type kotlin.Number");
                ((DoubleVariable) this).setValue$div_data_release(((Number) obj).doubleValue());
                return;
            }
            if (this instanceof ColorVariable) {
                m0.n(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
                ((ColorVariable) this).m3284setValuecIhhviA$div_data_release(((Color) obj).m3349unboximpl());
                return;
            }
            if (this instanceof UrlVariable) {
                m0.n(obj, "null cannot be cast to non-null type android.net.Uri");
                ((UrlVariable) this).setValue$div_data_release((Uri) obj);
                return;
            }
            if (this instanceof DictVariable) {
                m0.n(obj, "null cannot be cast to non-null type org.json.JSONObject");
                ((DictVariable) this).setValue$div_data_release((JSONObject) obj);
            } else if (this instanceof ArrayVariable) {
                m0.n(obj, "null cannot be cast to non-null type org.json.JSONArray");
                ((ArrayVariable) this).setValue$div_data_release((JSONArray) obj);
            } else {
                if (!(this instanceof PropertyVariable)) {
                    throw new o0();
                }
                throw new dr.p0("An operation is not implemented: Support property variables");
            }
        } catch (ClassCastException unused) {
            throw new VariableMutationException("Unable to set value with type " + obj.getClass() + " to " + this, null, 2, null);
        }
    }

    @l
    public JSONObject writeToJSON() {
        JSONSerializable jsVar;
        if (this instanceof ArrayVariable) {
            jsVar = new d(getName(), Expression.Companion.constant$default(Expression.Companion, ((ArrayVariable) this).getValue$div_data_release(), null, 2, null));
        } else if (this instanceof BooleanVariable) {
            jsVar = new j(getName(), Expression.Companion.constant$default(Expression.Companion, Boolean.valueOf(((BooleanVariable) this).getValue$div_data_release()), null, 2, null));
        } else if (this instanceof ColorVariable) {
            jsVar = new p(getName(), Expression.Companion.constant$default(Expression.Companion, Integer.valueOf(((ColorVariable) this).m3282getValueWpymAT4$div_data_release()), null, 2, null));
        } else if (this instanceof DictVariable) {
            jsVar = new b0(getName(), Expression.Companion.constant$default(Expression.Companion, ((DictVariable) this).getValue$div_data_release(), null, 2, null));
        } else if (this instanceof DoubleVariable) {
            jsVar = new mr(getName(), Expression.Companion.constant$default(Expression.Companion, Double.valueOf(((DoubleVariable) this).getValue$div_data_release()), null, 2, null));
        } else if (this instanceof IntegerVariable) {
            jsVar = new fr(getName(), Expression.Companion.constant$default(Expression.Companion, Long.valueOf(((IntegerVariable) this).getValue$div_data_release()), null, 2, null));
        } else if (this instanceof StringVariable) {
            jsVar = new ds(getName(), Expression.Companion.constant$default(Expression.Companion, ((StringVariable) this).getValue$div_data_release(), null, 2, null));
        } else {
            if (!(this instanceof UrlVariable)) {
                if (!(this instanceof PropertyVariable)) {
                    throw new o0();
                }
                throw new dr.p0("An operation is not implemented: Support property variables");
            }
            jsVar = new js(getName(), Expression.Companion.constant$default(Expression.Companion, ((UrlVariable) this).getValue$div_data_release(), null, 2, null));
        }
        return jsVar.writeToJSON();
    }

    private Variable() {
        this.observers = new ObserverList<>();
    }
}
