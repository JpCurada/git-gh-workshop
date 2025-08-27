## Branching & Git Workflow

### Branch Naming Convention

| Branch Type     | Naming Convention               | Example                 |
| --------------- | ------------------------------- | ----------------------- |
| **Main**        | `main`                          | `main`                  |
| **Development** | `dev`                           | `dev`                   |
| **Feature**     | `feature/ISSUE-ID-feature-name` | `feature/123-add-auth`  |
| **Bugfix**      | `bugfix/ISSUE-ID-issue-name`    | `bugfix/234-fix-footer` |
| **Hotfix**      | `hotfix/ISSUE-ID-critical-fix`  | `hotfix/345-fix-login`  |

#### 1. Switch to develop branch

```bash
git checkout dev
git pull origin dev
```

#### 2. Create a feature branch linked to an issue

```bash
git checkout -b feature/ISSUE-ID-feature-name
```

Example:

```bash
git checkout -b feature/123-add-login-auth
```

#### 3. Make your changes in the code

#### 4. Once you're done with your changes, commit

```bash
git add .
git commit -m "feat(auth): add login authentication (Closes #123)"
```

#### 5. Push to remote branch

```bash
git push origin feature/ISSUE-ID-feature-name
```

#### 6. Create a pull request (PR)

- Go to GitHub
- Open a new PR from feature/ISSUE-ID-feature-name → develop
- Use the [PR Template](<(#pull-request-description-format)>) below

---

## Commit Message Guidelines

### Commit Message Format

```
<type>(<scope>): <description>
```

### Allowed Commit Types

This project follows [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/).

| Type         | Description                                           |
| ------------ | ----------------------------------------------------- |
| **feat**     | A new feature                                         |
| **fix**      | A bug fix                                             |
| **docs**     | Documentation changes                                 |
| **style**    | Code style changes (formatting, etc.)                 |
| **refactor** | Code changes that neither fix a bug nor add a feature |
| **perf**     | Performance improvements                              |
| **test**     | Adding or modifying tests                             |
| **chore**    | Maintenance and other minor tasks                     |

#### Examples

```
git commit -m "feat(auth): add user authentication with JWT "
git commit -m "fix(navbar): resolve mobile responsiveness issue "
git commit -m "docs(readme): update contribution guide "
```

---

## 📋 Pull Request Guidelines

### PR Title Format:

```
<type>(<scope>): <short description>
```

Example

```
feat(auth): add user login functionality
fix(navbar): resolve mobile responsiveness issue
```

### PR Description Template

```
What’s New?
- [x] Briefly explain what was added

Screenshots of website (IMPORTANT)
_Add relevant screenshots/gifs_

🔗 Related Issues
Closes #ISSUE_NUMBER

Checklist (from issue)
- [ ] Code follows project conventions
- [ ] Linted & formatted
- [ ] Tested locally
```
