package soul_language;

import antlrv4_generator_calculator.ArrayInitBaseListener;
import antlrv4_generator_java.JavaBaseListener;
import antlrv4_generator_java.JavaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by szj on 2016/6/6.
 */
public class MyListener extends JavaBaseListener {
    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        super.enterCompilationUnit(ctx);
    }

    @Override
    public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
    }

    @Override
    public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        super.enterPackageDeclaration(ctx);
    }

    @Override
    public void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        super.exitPackageDeclaration(ctx);
    }

    @Override
    public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        super.enterImportDeclaration(ctx);
    }

    @Override
    public void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        super.exitImportDeclaration(ctx);
    }

    @Override
    public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        super.enterTypeDeclaration(ctx);
    }

    @Override
    public void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        super.exitTypeDeclaration(ctx);
    }

    @Override
    public void enterModifier(JavaParser.ModifierContext ctx) {
        super.enterModifier(ctx);
    }

    @Override
    public void exitModifier(JavaParser.ModifierContext ctx) {
        super.exitModifier(ctx);
    }

    @Override
    public void enterClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        super.enterClassOrInterfaceModifier(ctx);
    }

    @Override
    public void exitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
        super.exitClassOrInterfaceModifier(ctx);
    }

    @Override
    public void enterVariableModifier(JavaParser.VariableModifierContext ctx) {
        super.enterVariableModifier(ctx);
    }

    @Override
    public void exitVariableModifier(JavaParser.VariableModifierContext ctx) {
        super.exitVariableModifier(ctx);
    }

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx);
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);
    }

    @Override
    public void enterTypeParameters(JavaParser.TypeParametersContext ctx) {
        super.enterTypeParameters(ctx);
    }

    @Override
    public void exitTypeParameters(JavaParser.TypeParametersContext ctx) {
        super.exitTypeParameters(ctx);
    }

    @Override
    public void enterTypeParameter(JavaParser.TypeParameterContext ctx) {
        super.enterTypeParameter(ctx);
    }

    @Override
    public void exitTypeParameter(JavaParser.TypeParameterContext ctx) {
        super.exitTypeParameter(ctx);
    }

    @Override
    public void enterTypeBound(JavaParser.TypeBoundContext ctx) {
        super.enterTypeBound(ctx);
    }

    @Override
    public void exitTypeBound(JavaParser.TypeBoundContext ctx) {
        super.exitTypeBound(ctx);
    }

    @Override
    public void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        super.enterEnumDeclaration(ctx);
    }

    @Override
    public void exitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
        super.exitEnumDeclaration(ctx);
    }

    @Override
    public void enterEnumConstants(JavaParser.EnumConstantsContext ctx) {
        super.enterEnumConstants(ctx);
    }

    @Override
    public void exitEnumConstants(JavaParser.EnumConstantsContext ctx) {
        super.exitEnumConstants(ctx);
    }

    @Override
    public void enterEnumConstant(JavaParser.EnumConstantContext ctx) {
        super.enterEnumConstant(ctx);
    }

    @Override
    public void exitEnumConstant(JavaParser.EnumConstantContext ctx) {
        super.exitEnumConstant(ctx);
    }

    @Override
    public void enterEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        super.enterEnumBodyDeclarations(ctx);
    }

    @Override
    public void exitEnumBodyDeclarations(JavaParser.EnumBodyDeclarationsContext ctx) {
        super.exitEnumBodyDeclarations(ctx);
    }

    @Override
    public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        super.enterInterfaceDeclaration(ctx);
    }

    @Override
    public void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
        super.exitInterfaceDeclaration(ctx);
    }

    @Override
    public void enterTypeList(JavaParser.TypeListContext ctx) {
        super.enterTypeList(ctx);
    }

    @Override
    public void exitTypeList(JavaParser.TypeListContext ctx) {
        super.exitTypeList(ctx);
    }

    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        super.enterClassBody(ctx);
    }

    @Override
    public void exitClassBody(JavaParser.ClassBodyContext ctx) {
        super.exitClassBody(ctx);
    }

    @Override
    public void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        super.enterInterfaceBody(ctx);
    }

    @Override
    public void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx) {
        super.exitInterfaceBody(ctx);
    }

    @Override
    public void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        super.enterClassBodyDeclaration(ctx);
    }

    @Override
    public void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        super.exitClassBodyDeclaration(ctx);
    }

    @Override
    public void enterMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        super.enterMemberDeclaration(ctx);
    }

    @Override
    public void exitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) {
        super.exitMemberDeclaration(ctx);
    }

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        super.enterMethodDeclaration(ctx);
    }

    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        super.exitMethodDeclaration(ctx);
    }

    @Override
    public void enterGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        super.enterGenericMethodDeclaration(ctx);
    }

    @Override
    public void exitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        super.exitGenericMethodDeclaration(ctx);
    }

    @Override
    public void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        super.enterConstructorDeclaration(ctx);
    }

    @Override
    public void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        super.exitConstructorDeclaration(ctx);
    }

    @Override
    public void enterGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        super.enterGenericConstructorDeclaration(ctx);
    }

    @Override
    public void exitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
        super.exitGenericConstructorDeclaration(ctx);
    }

    @Override
    public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        super.enterFieldDeclaration(ctx);
    }

    @Override
    public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
        super.exitFieldDeclaration(ctx);
    }

    @Override
    public void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        super.enterInterfaceBodyDeclaration(ctx);
    }

    @Override
    public void exitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
        super.exitInterfaceBodyDeclaration(ctx);
    }

    @Override
    public void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        super.enterInterfaceMemberDeclaration(ctx);
    }

    @Override
    public void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) {
        super.exitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public void enterConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        super.enterConstDeclaration(ctx);
    }

    @Override
    public void exitConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
        super.exitConstDeclaration(ctx);
    }

    @Override
    public void enterConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        super.enterConstantDeclarator(ctx);
    }

    @Override
    public void exitConstantDeclarator(JavaParser.ConstantDeclaratorContext ctx) {
        super.exitConstantDeclarator(ctx);
    }

    @Override
    public void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        super.enterInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
        super.exitInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void enterGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        super.enterGenericInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void exitGenericInterfaceMethodDeclaration(JavaParser.GenericInterfaceMethodDeclarationContext ctx) {
        super.exitGenericInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        super.enterVariableDeclarators(ctx);
    }

    @Override
    public void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
        super.exitVariableDeclarators(ctx);
    }

    @Override
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        super.enterVariableDeclarator(ctx);
    }

    @Override
    public void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        super.exitVariableDeclarator(ctx);
    }

    @Override
    public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        super.enterVariableDeclaratorId(ctx);
    }

    @Override
    public void exitVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
        super.exitVariableDeclaratorId(ctx);
    }

    @Override
    public void enterVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        super.enterVariableInitializer(ctx);
    }

    @Override
    public void exitVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        super.exitVariableInitializer(ctx);
    }

    @Override
    public void enterArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        super.enterArrayInitializer(ctx);
    }

    @Override
    public void exitArrayInitializer(JavaParser.ArrayInitializerContext ctx) {
        super.exitArrayInitializer(ctx);
    }

    @Override
    public void enterEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
        super.enterEnumConstantName(ctx);
    }

    @Override
    public void exitEnumConstantName(JavaParser.EnumConstantNameContext ctx) {
        super.exitEnumConstantName(ctx);
    }

    @Override
    public void enterType(JavaParser.TypeContext ctx) {
        super.enterType(ctx);
    }

    @Override
    public void exitType(JavaParser.TypeContext ctx) {
        super.exitType(ctx);
    }

    @Override
    public void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        super.enterClassOrInterfaceType(ctx);
    }

    @Override
    public void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        super.exitClassOrInterfaceType(ctx);
    }

    @Override
    public void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        super.enterPrimitiveType(ctx);
    }

    @Override
    public void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
        super.exitPrimitiveType(ctx);
    }

    @Override
    public void enterTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        super.enterTypeArguments(ctx);
    }

    @Override
    public void exitTypeArguments(JavaParser.TypeArgumentsContext ctx) {
        super.exitTypeArguments(ctx);
    }

    @Override
    public void enterTypeArgument(JavaParser.TypeArgumentContext ctx) {
        super.enterTypeArgument(ctx);
    }

    @Override
    public void exitTypeArgument(JavaParser.TypeArgumentContext ctx) {
        super.exitTypeArgument(ctx);
    }

    @Override
    public void enterQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        super.enterQualifiedNameList(ctx);
    }

    @Override
    public void exitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) {
        super.exitQualifiedNameList(ctx);
    }

    @Override
    public void enterFormalParameters(JavaParser.FormalParametersContext ctx) {
        super.enterFormalParameters(ctx);
    }

    @Override
    public void exitFormalParameters(JavaParser.FormalParametersContext ctx) {
        super.exitFormalParameters(ctx);
    }

    @Override
    public void enterFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        super.enterFormalParameterList(ctx);
    }

    @Override
    public void exitFormalParameterList(JavaParser.FormalParameterListContext ctx) {
        super.exitFormalParameterList(ctx);
    }

    @Override
    public void enterFormalParameter(JavaParser.FormalParameterContext ctx) {
        super.enterFormalParameter(ctx);
    }

    @Override
    public void exitFormalParameter(JavaParser.FormalParameterContext ctx) {
        super.exitFormalParameter(ctx);
    }

    @Override
    public void enterLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        super.enterLastFormalParameter(ctx);
    }

    @Override
    public void exitLastFormalParameter(JavaParser.LastFormalParameterContext ctx) {
        super.exitLastFormalParameter(ctx);
    }

    @Override
    public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
        super.enterMethodBody(ctx);
    }

    @Override
    public void exitMethodBody(JavaParser.MethodBodyContext ctx) {
        super.exitMethodBody(ctx);
    }

    @Override
    public void enterConstructorBody(JavaParser.ConstructorBodyContext ctx) {
        super.enterConstructorBody(ctx);
    }

    @Override
    public void exitConstructorBody(JavaParser.ConstructorBodyContext ctx) {
        super.exitConstructorBody(ctx);
    }

    @Override
    public void enterQualifiedName(JavaParser.QualifiedNameContext ctx) {
        super.enterQualifiedName(ctx);
    }

    @Override
    public void exitQualifiedName(JavaParser.QualifiedNameContext ctx) {
        super.exitQualifiedName(ctx);
    }

    @Override
    public void enterLiteral(JavaParser.LiteralContext ctx) {
        super.enterLiteral(ctx);
    }

    @Override
    public void exitLiteral(JavaParser.LiteralContext ctx) {
        super.exitLiteral(ctx);
    }

    @Override
    public void enterAnnotation(JavaParser.AnnotationContext ctx) {
        super.enterAnnotation(ctx);
    }

    @Override
    public void exitAnnotation(JavaParser.AnnotationContext ctx) {
        super.exitAnnotation(ctx);
    }

    @Override
    public void enterAnnotationName(JavaParser.AnnotationNameContext ctx) {
        super.enterAnnotationName(ctx);
    }

    @Override
    public void exitAnnotationName(JavaParser.AnnotationNameContext ctx) {
        super.exitAnnotationName(ctx);
    }

    @Override
    public void enterElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        super.enterElementValuePairs(ctx);
    }

    @Override
    public void exitElementValuePairs(JavaParser.ElementValuePairsContext ctx) {
        super.exitElementValuePairs(ctx);
    }

    @Override
    public void enterElementValuePair(JavaParser.ElementValuePairContext ctx) {
        super.enterElementValuePair(ctx);
    }

    @Override
    public void exitElementValuePair(JavaParser.ElementValuePairContext ctx) {
        super.exitElementValuePair(ctx);
    }

    @Override
    public void enterElementValue(JavaParser.ElementValueContext ctx) {
        super.enterElementValue(ctx);
    }

    @Override
    public void exitElementValue(JavaParser.ElementValueContext ctx) {
        super.exitElementValue(ctx);
    }

    @Override
    public void enterElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        super.enterElementValueArrayInitializer(ctx);
    }

    @Override
    public void exitElementValueArrayInitializer(JavaParser.ElementValueArrayInitializerContext ctx) {
        super.exitElementValueArrayInitializer(ctx);
    }

    @Override
    public void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        super.enterAnnotationTypeDeclaration(ctx);
    }

    @Override
    public void exitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
        super.exitAnnotationTypeDeclaration(ctx);
    }

    @Override
    public void enterAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        super.enterAnnotationTypeBody(ctx);
    }

    @Override
    public void exitAnnotationTypeBody(JavaParser.AnnotationTypeBodyContext ctx) {
        super.exitAnnotationTypeBody(ctx);
    }

    @Override
    public void enterAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        super.enterAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public void exitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
        super.exitAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public void enterAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        super.enterAnnotationTypeElementRest(ctx);
    }

    @Override
    public void exitAnnotationTypeElementRest(JavaParser.AnnotationTypeElementRestContext ctx) {
        super.exitAnnotationTypeElementRest(ctx);
    }

    @Override
    public void enterAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        super.enterAnnotationMethodOrConstantRest(ctx);
    }

    @Override
    public void exitAnnotationMethodOrConstantRest(JavaParser.AnnotationMethodOrConstantRestContext ctx) {
        super.exitAnnotationMethodOrConstantRest(ctx);
    }

    @Override
    public void enterAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        super.enterAnnotationMethodRest(ctx);
    }

    @Override
    public void exitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
        super.exitAnnotationMethodRest(ctx);
    }

    @Override
    public void enterAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        super.enterAnnotationConstantRest(ctx);
    }

    @Override
    public void exitAnnotationConstantRest(JavaParser.AnnotationConstantRestContext ctx) {
        super.exitAnnotationConstantRest(ctx);
    }

    @Override
    public void enterDefaultValue(JavaParser.DefaultValueContext ctx) {
        super.enterDefaultValue(ctx);
    }

    @Override
    public void exitDefaultValue(JavaParser.DefaultValueContext ctx) {
        super.exitDefaultValue(ctx);
    }

    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(JavaParser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterBlockStatement(JavaParser.BlockStatementContext ctx) {
        super.enterBlockStatement(ctx);
    }

    @Override
    public void exitBlockStatement(JavaParser.BlockStatementContext ctx) {
        super.exitBlockStatement(ctx);
    }

    @Override
    public void enterLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        super.enterLocalVariableDeclarationStatement(ctx);
    }

    @Override
    public void exitLocalVariableDeclarationStatement(JavaParser.LocalVariableDeclarationStatementContext ctx) {
        super.exitLocalVariableDeclarationStatement(ctx);
    }

    @Override
    public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        super.enterLocalVariableDeclaration(ctx);
    }

    @Override
    public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) {
        super.exitLocalVariableDeclaration(ctx);
    }

    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(JavaParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterCatchClause(JavaParser.CatchClauseContext ctx) {
        super.enterCatchClause(ctx);
    }

    @Override
    public void exitCatchClause(JavaParser.CatchClauseContext ctx) {
        super.exitCatchClause(ctx);
    }

    @Override
    public void enterCatchType(JavaParser.CatchTypeContext ctx) {
        super.enterCatchType(ctx);
    }

    @Override
    public void exitCatchType(JavaParser.CatchTypeContext ctx) {
        super.exitCatchType(ctx);
    }

    @Override
    public void enterFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        super.enterFinallyBlock(ctx);
    }

    @Override
    public void exitFinallyBlock(JavaParser.FinallyBlockContext ctx) {
        super.exitFinallyBlock(ctx);
    }

    @Override
    public void enterResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        super.enterResourceSpecification(ctx);
    }

    @Override
    public void exitResourceSpecification(JavaParser.ResourceSpecificationContext ctx) {
        super.exitResourceSpecification(ctx);
    }

    @Override
    public void enterResources(JavaParser.ResourcesContext ctx) {
        super.enterResources(ctx);
    }

    @Override
    public void exitResources(JavaParser.ResourcesContext ctx) {
        super.exitResources(ctx);
    }

    @Override
    public void enterResource(JavaParser.ResourceContext ctx) {
        super.enterResource(ctx);
    }

    @Override
    public void exitResource(JavaParser.ResourceContext ctx) {
        super.exitResource(ctx);
    }

    @Override
    public void enterSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        super.enterSwitchBlockStatementGroup(ctx);
    }

    @Override
    public void exitSwitchBlockStatementGroup(JavaParser.SwitchBlockStatementGroupContext ctx) {
        super.exitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public void enterSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        super.enterSwitchLabel(ctx);
    }

    @Override
    public void exitSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        super.exitSwitchLabel(ctx);
    }

    @Override
    public void enterForControl(JavaParser.ForControlContext ctx) {
        super.enterForControl(ctx);
    }

    @Override
    public void exitForControl(JavaParser.ForControlContext ctx) {
        super.exitForControl(ctx);
    }

    @Override
    public void enterForInit(JavaParser.ForInitContext ctx) {
        super.enterForInit(ctx);
    }

    @Override
    public void exitForInit(JavaParser.ForInitContext ctx) {
        super.exitForInit(ctx);
    }

    @Override
    public void enterEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        super.enterEnhancedForControl(ctx);
    }

    @Override
    public void exitEnhancedForControl(JavaParser.EnhancedForControlContext ctx) {
        super.exitEnhancedForControl(ctx);
    }

    @Override
    public void enterForUpdate(JavaParser.ForUpdateContext ctx) {
        super.enterForUpdate(ctx);
    }

    @Override
    public void exitForUpdate(JavaParser.ForUpdateContext ctx) {
        super.exitForUpdate(ctx);
    }

    @Override
    public void enterParExpression(JavaParser.ParExpressionContext ctx) {
        super.enterParExpression(ctx);
    }

    @Override
    public void exitParExpression(JavaParser.ParExpressionContext ctx) {
        super.exitParExpression(ctx);
    }

    @Override
    public void enterExpressionList(JavaParser.ExpressionListContext ctx) {
        super.enterExpressionList(ctx);
    }

    @Override
    public void exitExpressionList(JavaParser.ExpressionListContext ctx) {
        super.exitExpressionList(ctx);
    }

    @Override
    public void enterStatementExpression(JavaParser.StatementExpressionContext ctx) {
        super.enterStatementExpression(ctx);
    }

    @Override
    public void exitStatementExpression(JavaParser.StatementExpressionContext ctx) {
        super.exitStatementExpression(ctx);
    }

    @Override
    public void enterConstantExpression(JavaParser.ConstantExpressionContext ctx) {
        super.enterConstantExpression(ctx);
    }

    @Override
    public void exitConstantExpression(JavaParser.ConstantExpressionContext ctx) {
        super.exitConstantExpression(ctx);
    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(JavaParser.ExpressionContext ctx) {
        System.out.println(ctx.expression(0));
        System.out.println(ctx.expression(1));
        System.out.println(ctx.primary());
        super.exitExpression(ctx);
    }

    @Override
    public void enterPrimary(JavaParser.PrimaryContext ctx) {
        super.enterPrimary(ctx);
    }

    @Override
    public void exitPrimary(JavaParser.PrimaryContext ctx) {
//        System.out.println(ctx.getText());
        super.exitPrimary(ctx);
    }

    @Override
    public void enterCreator(JavaParser.CreatorContext ctx) {
        super.enterCreator(ctx);
    }

    @Override
    public void exitCreator(JavaParser.CreatorContext ctx) {
        super.exitCreator(ctx);
    }

    @Override
    public void enterCreatedName(JavaParser.CreatedNameContext ctx) {
        super.enterCreatedName(ctx);
    }

    @Override
    public void exitCreatedName(JavaParser.CreatedNameContext ctx) {
        super.exitCreatedName(ctx);
    }

    @Override
    public void enterInnerCreator(JavaParser.InnerCreatorContext ctx) {
        super.enterInnerCreator(ctx);
    }

    @Override
    public void exitInnerCreator(JavaParser.InnerCreatorContext ctx) {
        super.exitInnerCreator(ctx);
    }

    @Override
    public void enterArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        super.enterArrayCreatorRest(ctx);
    }

    @Override
    public void exitArrayCreatorRest(JavaParser.ArrayCreatorRestContext ctx) {
        super.exitArrayCreatorRest(ctx);
    }

    @Override
    public void enterClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        super.enterClassCreatorRest(ctx);
    }

    @Override
    public void exitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) {
        super.exitClassCreatorRest(ctx);
    }

    @Override
    public void enterExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        super.enterExplicitGenericInvocation(ctx);
    }

    @Override
    public void exitExplicitGenericInvocation(JavaParser.ExplicitGenericInvocationContext ctx) {
        super.exitExplicitGenericInvocation(ctx);
    }

    @Override
    public void enterNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        super.enterNonWildcardTypeArguments(ctx);
    }

    @Override
    public void exitNonWildcardTypeArguments(JavaParser.NonWildcardTypeArgumentsContext ctx) {
        super.exitNonWildcardTypeArguments(ctx);
    }

    @Override
    public void enterTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        super.enterTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void exitTypeArgumentsOrDiamond(JavaParser.TypeArgumentsOrDiamondContext ctx) {
        super.exitTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void enterNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        super.enterNonWildcardTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void exitNonWildcardTypeArgumentsOrDiamond(JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
        super.exitNonWildcardTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public void enterSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        super.enterSuperSuffix(ctx);
    }

    @Override
    public void exitSuperSuffix(JavaParser.SuperSuffixContext ctx) {
        super.exitSuperSuffix(ctx);
    }

    @Override
    public void enterExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        super.enterExplicitGenericInvocationSuffix(ctx);
    }

    @Override
    public void exitExplicitGenericInvocationSuffix(JavaParser.ExplicitGenericInvocationSuffixContext ctx) {
        super.exitExplicitGenericInvocationSuffix(ctx);
    }

    @Override
    public void enterArguments(JavaParser.ArgumentsContext ctx) {
        super.enterArguments(ctx);
    }

    @Override
    public void exitArguments(JavaParser.ArgumentsContext ctx) {
        super.exitArguments(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
