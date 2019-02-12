package domainapp.modules.simple.dom.impl;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QAidObject extends PersistableExpressionImpl<AidObject> implements PersistableExpression<AidObject>
{
    public static final QAidObject jdoCandidate = candidate("this");

    public static QAidObject candidate(String name)
    {
        return new QAidObject(null, name, 5);
    }

    public static QAidObject candidate()
    {
        return jdoCandidate;
    }

    public static QAidObject parameter(String name)
    {
        return new QAidObject(AidObject.class, name, ExpressionType.PARAMETER);
    }

    public static QAidObject variable(String name)
    {
        return new QAidObject(AidObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression notes;

    public QAidObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }

    public QAidObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }
}
